using Microsoft.AspNetCore.Mvc;

namespace WebAppCachingDemo
{
    public class Program
    {
        public static void Main(string[] args)
        {
            var builder = WebApplication.CreateBuilder(args);

            // Add services to the container.
            builder.Services.AddControllersWithViews(options =>
            {
                options.CacheProfiles.Add("Hourly", new CacheProfile()
                {
                    Duration = 60 * 60 // 1 hour
                });
                options.CacheProfiles.Add("Weekly", new CacheProfile()
                {
                    Duration = 60 * 60 * 24 * 7 // 7 days
                });
            });

            builder.Services.AddMemoryCache();
            builder.Services.AddResponseCaching();

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
            app.UseResponseCaching();

            app.UseAuthorization();

            app.MapControllerRoute(
                name: "default",
                pattern: "{controller=Home}/{action=Index}/{id?}");

            app.Run();
        }
    }
}