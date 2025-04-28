using Microsoft.EntityFrameworkCore;
using MVCStudent.Repository;
using MVCStudent.Services;

namespace MVCStudent
{
    public class Program
    {
       public static void Main(string[] args)
        {
            var builder = WebApplication.CreateBuilder(args);

            builder.Services.AddControllersWithViews();

            builder.Services.AddDbContextPool<Appdbcontext>(
            //passing connection string in 
            options => options.UseSqlServer(builder.Configuration.GetConnectionString("DefaultString")));
            builder.Services.AddScoped<IStudentRepo, SqlStudentRepo>();
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

            app.MapControllerRoute(
                name: "default",
                pattern: "{controller=Student}/{action=Index}/{id?}"
             );

            app.Run();
        }
    }
}
