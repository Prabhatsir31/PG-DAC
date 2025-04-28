namespace CustomMiddleware.Models
{
    public static class MiddlewareExtensionsBase
    {
        public static IApplicationBuilder UseMyMiddleware(this IApplicationBuilder builder)
        {
            return builder.UseMiddleware<CustomerMiddleware>();
        }
    }
}