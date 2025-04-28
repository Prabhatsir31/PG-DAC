using Microsoft.AspNetCore.Identity;
using Microsoft.AspNetCore.Identity.EntityFrameworkCore;
using Microsoft.EntityFrameworkCore;
using UsersApp.Models;

namespace UsersApp.Data
{
    // AppDbContext.cs
    public class AppDbContext : IdentityDbContext<Users>
    {
        public AppDbContext(DbContextOptions<AppDbContext> options) : base(options) { }

        public DbSet<Users> AppUsers { get; set; }  // just a table, not Identity
    }

}
