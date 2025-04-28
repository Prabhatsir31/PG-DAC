using Microsoft.AspNetCore.Builder;
using Microsoft.AspNetCore.Http;
using System.Threading.Tasks;

namespace CustomMiddleware.Models
{
    // Custom Middleware Class
    public class CustomerMiddleware
    {
        private readonly RequestDelegate _next;

        public CustomerMiddleware(RequestDelegate next)
        {
            _next = next;
        }

        public async Task Invoke(HttpContext context)
        {
            await context.Response.WriteAsync("Hello mmmmm Custom Middleware \n");
            await _next(context);
            await context.Response.WriteAsync("bye---- Middleware \n");
        }
    }

    // Middleware Extension Method
    public static class MiddlewareExtensions
    {
        public static IApplicationBuilder UseMyMiddleware(this IApplicationBuilder builder)
        {
            return builder.UseMiddleware<CustomerMiddleware>();
        }
    }
}
