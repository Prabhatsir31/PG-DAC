using APIDEMO1.Service;
using Microsoft.EntityFrameworkCore;
using System.Text.Json.Serialization;
using WebApplication1.Models;

namespace APIDEMO1
{
    public class Program
    {
        public static void Main(string[] args)
        {
            var builder = WebApplication.CreateBuilder(args);
                
            // Add services to the container
            builder.Services.AddControllers().AddJsonOptions(options =>
                options.JsonSerializerOptions.ReferenceHandler =
                ReferenceHandler.IgnoreCycles);

            // Add DbContext to services
            builder.Services.AddDbContext<AppdbContextRepository>(options =>
                options.UseSqlServer(builder.Configuration.GetConnectionString("EmployeeDBConnection")));

            builder.Services.AddControllers();

            builder.Services.AddScoped<IEmployeeService, SqlEmployeeService>();

            // Learn more about configuring Swagger/OpenAPI at https://aka.ms/aspnetcore/swashbuckle
            builder.Services.AddEndpointsApiExplorer();
            builder.Services.AddSwaggerGen();

            var app = builder.Build();

            // Configure the HTTP request pipeline.
            if (app.Environment.IsDevelopment())
            {
                app.UseSwagger();
                app.UseSwaggerUI();
            }

            app.UseHttpsRedirection();

            app.UseAuthorization();


            app.MapControllers();

            app.Run();
        }
    }
}
