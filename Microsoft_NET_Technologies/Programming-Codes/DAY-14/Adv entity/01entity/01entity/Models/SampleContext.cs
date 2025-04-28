using Microsoft.EntityFrameworkCore;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _01entity.Models
{
    public class SampleContext : DbContext
    {
        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            optionsBuilder.UseSqlServer(@"Data Source=(localdb)\ProjectModels;Initial Catalog=DemoData;Integrated Security=True;;");
        }


        public DbSet<Book> Books { get; set; }
        public DbSet<Author> Authors { get; set; }

    }
}
