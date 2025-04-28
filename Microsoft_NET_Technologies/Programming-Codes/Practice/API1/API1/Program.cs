using API1.Repository;
using API1.Service;
using Microsoft.EntityFrameworkCore;
using System.Text.Json.Serialization;

namespace APIDEMO1
{
    public class Program
    {
        public static void Main(string[] args)
        {
            var builder = WebApplication.CreateBuilder(args);

            builder.Services.AddControllers();

            // Learn more about configuring Swagger/OpenAPI at https://aka.ms/aspnetcore/swashbuckle
            builder.Services.AddEndpointsApiExplorer();
            builder.Services.AddSwaggerGen();

            // Add services to the container
            builder.Services.AddControllers().AddJsonOptions(options =>
                options.JsonSerializerOptions.ReferenceHandler =
                ReferenceHandler.IgnoreCycles);

            // Add DbContext to services
            builder.Services.AddDbContext<AppdbContext>(options =>
                options.UseSqlServer(builder.Configuration.GetConnectionString("EmployeeDBConnection")));


            builder.Services.AddScoped<IAPIServices, SqlAPIService>();

            

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
