using Microsoft.EntityFrameworkCore;
using Microsoft.Extensions.DependencyInjection.Extensions;
using MVCEmpDept.Models;
using MVCEmpDept.Repository;
using MVCEmpDept.Service;
using Microsoft.Extensions.Configuration;

namespace MVCEmpDept
{
    public class Program
    {
        public static void Main(string[] args)
        {
            var builder = WebApplication.CreateBuilder(args);

            // Add DbContext to services
            builder.Services.AddDbContext<AppdbContextRepository>(options =>
                options.UseSqlServer(builder.Configuration.GetConnectionString("EmployeeDBConnection")));

            // Register your services
            builder.Services.AddScoped<IEmployeeService, SqlEmployeeService>();

            // Add controllers with views and JSON options if needed
            builder.Services.AddControllersWithViews()
                .AddJsonOptions(options =>
                    options.JsonSerializerOptions.DefaultIgnoreCondition = System.Text.Json.Serialization.JsonIgnoreCondition.WhenWritingNull);

            // Learn more about configuring Swagger/OpenAPI at https://aka.ms/aspnetcore/swashbuckle
            builder.Services.AddEndpointsApiExplorer();
            builder.Services.AddCors(options =>
            {
                options.AddPolicy("MyAllowSpecificOrigins",
                                  builder =>
                                  {
                                      builder.WithOrigins("http://127.0.0.1:5500").AllowAnyHeader().AllowAnyMethod();
                                  });
            });


            // Add session and HttpContextAccessor for session management
            builder.Services.AddSession();
            builder.Services.AddHttpContextAccessor(); // ✅ Needed for session/cookie in views

            var app = builder.Build();

            // Configure middleware
            app.UseHttpsRedirection();
            app.UseStaticFiles();
            app.UseRouting();
            app.UseSession();
            app.UseAuthorization();

            // Set up default route
            app.MapControllerRoute(
                name: "default",
                pattern: "{controller=Home}/{action=Index}/{id?}");

            // Run the app
            app.Run();
        }
    }
}
