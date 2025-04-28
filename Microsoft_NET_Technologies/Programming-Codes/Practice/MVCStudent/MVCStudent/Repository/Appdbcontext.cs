using Microsoft.EntityFrameworkCore;
using MVCStudent.Models;

namespace MVCStudent.Repository

{
    public class Appdbcontext : DbContext
    {
        public Appdbcontext(DbContextOptions<Appdbcontext> options)
            : base(options)
            { }
        public DbSet<Student> student {  get; set; }
    }
}
