using CustomMiddleware.Models;

namespace CustomMiddleware
{
    public class Program
    {
        public static void Main(string[] args)
        {
            var builder = WebApplication.CreateBuilder(args);

            // Add services to the container.
            builder.Services.AddControllersWithViews();

            var app = builder.Build();

            // Configure the HTTP request pipeline.
            if (!app.Environment.IsDevelopment())
            {
                app.UseExceptionHandler("/Home/Error");
                // The default HSTS value is 30 days. You may want to change this for production scenarios, see https://aka.ms/aspnetcore-hsts.
                app.UseHsts();
            }

            app.UseHttpsRedirection();
            app.UseStaticFiles();

            app.UseRouting();

            app.UseAuthorization();

            //app.MapControllerRoute(
            //    name: "default",
            //    pattern: "{controller=Home}/{action=Index}/{id?}");

            app.UseMiddleware<CustomerMiddleware>();
            
            app.Use(async (context, next) =>
            {
                await context.Response.WriteAsync("Middleware1: Incoming Request\n");
                await next(context);
                await context.Response.WriteAsync("Middleware1: Outgoing Response\n");
            });
            app.Use(async (context, next) =>
            {
                await context.Response.WriteAsync("Middleware2: Incoming Request\n");
                await next();
                await context.Response.WriteAsync("Middleware2: Outgoing Response\n");
            });
            app.Run(async (context) =>
            {
                await context.Response.WriteAsync("Middleware3: Incoming Request handled and response generated\n");
            });


            app.Run();
        }
    }
}
