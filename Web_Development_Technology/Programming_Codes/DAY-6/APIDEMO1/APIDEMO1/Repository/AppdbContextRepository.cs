//using APIDEMO1.Models;
//using Microsoft.EntityFrameworkCore;

//namespace APIDEMO1.Repository
//{
//    public class AppdbContextRepository : DbContext
//    {
//        public AppdbContextRepository(DbContextOptions<AppdbContextRepository> options)
//             : base(options)
//        {
//        }

//        public DbSet<Employee> Employee { get; set; }
//        public DbSet<Department> Department { get; set; }

//    }
//}






using System.Collections.Generic;
using APIDEMO1.Models;
using Microsoft.EntityFrameworkCore;
namespace WebApplication1.Models
{
    public class AppdbContextRepository : DbContext
    {

        public AppdbContextRepository(DbContextOptions<AppdbContextRepository> options)
                 : base(options)
        {
        }
        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            if (!optionsBuilder.IsConfigured)
            {
                optionsBuilder.UseSqlServer(@"Data Source=(localdb)\\ProjectModels;Initial Catalog=API;Integrated Security=True;");
            }
        }
        public DbSet<Employee> Employee { get; set; }
    }

}








