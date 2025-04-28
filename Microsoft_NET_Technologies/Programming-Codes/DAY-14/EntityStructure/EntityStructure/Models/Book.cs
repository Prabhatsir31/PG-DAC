using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EntityStructure.Models
{
    internal class Book
    {
        public int BookId { get; set; }
        public string Title { get; set; }
        public Author Author { get; set; }
        public string Isbn { get; set; }



    }
}
