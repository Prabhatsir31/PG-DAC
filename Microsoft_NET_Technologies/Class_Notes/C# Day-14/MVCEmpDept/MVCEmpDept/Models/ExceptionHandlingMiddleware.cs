using Newtonsoft.Json;
using System.Net;
using System.Runtime.CompilerServices;

namespace MVCEmpDept.Models
{
    public class ExceptionHandlingMiddleware
    {       
            private readonly RequestDelegate _next;
            private readonly ILogger<ExceptionHandlingMiddleware> _logger;

            public ExceptionHandlingMiddleware(RequestDelegate next, ILogger<ExceptionHandlingMiddleware> logger)
            {
                _next = next;
                _logger = logger;
            }

            public async Task InvokeAsync(HttpContext httpContext)
            {
                try
                {
               // _logger.LogInformation("get")
                    await _next(httpContext);
                }
                catch (Exception ex)
                {
                    await HandleExceptionAsync(httpContext, ex);
                }
            }
        private  async Task HandleExceptionAsync(HttpContext context, Exception exception)
        {
            var code = HttpStatusCode.InternalServerError; // 500 if unexpected

            var result = new BaseResponseDTO()
            {
                ErrorCode = (int)HttpStatusCode.InternalServerError,
                ErrorMessage = exception.Message,
                Succeed = false,
            };
            var jsonResult = JsonConvert.SerializeObject(result);
            context.Response.ContentType = "application/json";
            context.Response.StatusCode = (int)code;
            await  context.Response.WriteAsync(jsonResult);
        }
    }

}
    