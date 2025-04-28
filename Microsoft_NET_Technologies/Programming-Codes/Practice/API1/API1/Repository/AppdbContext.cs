using Microsoft.EntityFrameworkCore;
using API1.Models;

namespace API1.Repository
{
    public class AppdbContext : DbContext
    { 
        public AppdbContext(DbContextOptions<AppdbContext> options) : base(options) { }

        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            if (!optionsBuilder.IsConfigured)
            {
                optionsBuilder.UseSqlServer(@"Data Source=(localdb)\\ProjectModels;Initial Catalog=API;Integrated Security=True;");
            }
        }

        public DbSet<Employee> Employee{ get; set; }

    }
}
