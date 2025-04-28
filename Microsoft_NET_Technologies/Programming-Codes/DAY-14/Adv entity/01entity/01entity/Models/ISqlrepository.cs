using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _01entity.Models
{
    internal interface ISqlrepository
    {
      List<Book> GetAll();
        Book GetById(int id);
        Book DeleteById(int id);
        Book AddBook(Book book);
        Book Modify(Book book);
    }
}
