using Microsoft.EntityFrameworkCore;
using MVC.Models;

namespace MVC.Repository
{
    public class Appdbcontext : DbContext
    {
        public Appdbcontext(DbContextOptions<Appdbcontext> options)
             : base(options)
        {
        }

        public DbSet<Employee> Employees { get; set; }
    }
}
