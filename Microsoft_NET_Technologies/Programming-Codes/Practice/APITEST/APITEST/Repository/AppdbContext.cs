using APITEST.Model;
using APITEST.Models;
using Microsoft.EntityFrameworkCore;


namespace APITEST.Repository
{
    public class AppdbContext : DbContext
    {
        public AppdbContext(DbContextOptions<AppdbContext> options) : base(options)
        {
        }

        public DbSet<Employee> Employees { get; set; }
        public DbSet<Department> Departments { get; set; }
    }
}
