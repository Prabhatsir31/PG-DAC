using Microsoft.EntityFrameworkCore;
using Microsoft.Extensions.DependencyInjection.Extensions;
using MVCEmpDept.Models;
using MVCEmpDept.Repository;
using MVCEmpDept.Service;
using System.Text.Json.Serialization;

namespace MVCEmpDept
{
    public class Program
    {
        public static void Main(string[] args)
        {
            var builder = WebApplication.CreateBuilder(args);

            // Add services to the container.
            builder.Services.AddControllersWithViews();
                //.AddJsonOptions(options => 
               // options.JsonSerializerOptions.ReferenceHandler = ReferenceHandler.IgnoreCycles);

            builder.Services.AddDbContextPool<AppdbContextRepository>(
            options => options.UseSqlServer(builder.Configuration.GetConnectionString("EmployeeDBConnection"))
            );
           
          
            builder.Services.AddScoped<IEmployeeService, SqlEmployeeService>();
           

            var app = builder.Build();

            // Configure the HTTP request pipeline.
            if (!app.Environment.IsDevelopment())
            {
                app.UseExceptionHandler("/Home/Error");
                // The default HSTS value is 30 days. You may want to change this for production scenarios, see https://aka.ms/aspnetcore-hsts.
                app.UseHsts();
            }
            else
            {//if you look for Endpoint which is ot there then
                //it will display status code and message
            //  app.UseStatusCodePages();
               app.UseStatusCodePagesWithRedirects("/Error/{0}");

            }
         //   app.UseMiddleware<ExceptionHandlingMiddleware>();

            app.UseHttpsRedirection();
            app.UseStaticFiles();

            app.UseRouting();

            app.UseAuthorization();

            app.MapControllerRoute(
                name: "default",
                pattern: "{controller=Employee}/{action=Index}/{id?}");

            app.Run();
        }
    }
}
