using Microsoft.EntityFrameworkCore;
using MVCEmpDept.Models;

namespace MVCEmpDept.Repository
{
    public class AppdbContextRepository : DbContext
    {
        public AppdbContextRepository(DbContextOptions<AppdbContextRepository> options)
             : base(options)
        {
        }

        public DbSet<Employee> Employee { get; set; }
        public DbSet<Department> Department { get; set; }

    }
}
