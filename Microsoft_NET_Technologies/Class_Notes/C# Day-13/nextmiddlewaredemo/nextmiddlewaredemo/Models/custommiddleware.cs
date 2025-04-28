namespace nextmiddlewaredemo.Models
{
    public class Custommiddleware
    {

        private readonly RequestDelegate _next;

        public Custommiddleware(RequestDelegate next)
        {
            _next = next;
        }

        public async Task Invoke(HttpContext httpContext)
        {
            await httpContext.Response.WriteAsync("Hello mmmmm Custom Middleware \n");
            await _next(httpContext);
            await httpContext.Response.WriteAsync("bye---- Middleware \n");

        }

    }
    // Extension method used to add the middleware to the HTTP request pipeline.
    public static class MiddlewareExtensions
    {
        public static IApplicationBuilder UseMyMiddleware(this IApplicationBuilder builder)
        {
            return builder.UseMiddleware<Custommiddleware>();
        }
    }

}
