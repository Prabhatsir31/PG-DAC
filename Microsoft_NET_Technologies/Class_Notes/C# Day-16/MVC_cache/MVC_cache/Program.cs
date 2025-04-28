using Microsoft.AspNetCore.Mvc;

namespace MVC_cache
{
    public class Program
    {
        public static void Main(string[] args)
        {
            var builder = WebApplication.CreateBuilder(args);

            // Add services to the container.
            builder.Services.AddControllersWithViews();
              builder.Services.AddMemoryCache();
            builder.Services.AddResponseCaching();

            builder.Services.AddControllersWithViews
                (   options =>    
                {
                    options.CacheProfiles.Add("Hourly", new CacheProfile()
                    {
                        Duration = 60 * 60 // 1 hour
                    });
                
                  options.CacheProfiles.Add("Weekly", new CacheProfile()
                  {
                     Duration = 60 * 60 * 24 * 7 // 7 days
                   });
                }
                );


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
            app.UseResponseCaching();

            app.UseRouting();

            app.UseAuthorization();

            app.MapControllerRoute(
                name: "default",
                pattern: "{controller=Cachedemo}/{action=Index}/{id?}");

            app.Run();
        }
    }
}
