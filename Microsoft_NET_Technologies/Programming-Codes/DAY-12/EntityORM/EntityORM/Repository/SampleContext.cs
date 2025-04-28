using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using EntityORM.Models;
using Microsoft.EntityFrameworkCore;
using Microsoft.Extensions.Logging;

namespace EntityORM.Repository
{
    public class SampleContext : DbContext
    {
        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            if (!optionsBuilder.IsConfigured)
                optionsBuilder.UseSqlServer("Data Source=(localdb)\\ProjectModels;Initial Catalog=ADOcode;Integrated Security=True");

        }


        public DbSet<Book> Books { get; set; }
        public DbSet<Author> Authors { get; set; }

    }
}
