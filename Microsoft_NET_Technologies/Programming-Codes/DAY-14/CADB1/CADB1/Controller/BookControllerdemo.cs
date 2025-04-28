using CADB1.Models;
using Microsoft.EntityFrameworkCore.Internal;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CADB1.Controllers
{
    internal class BookControllerdemo
    {
        ISqlrepository Service;
        public BookControllerdemo(ISqlrepository Service)
        {
            this.Service = Service;
        }

        public Book Add(Book book)
        {
            Service.AddBook(book);
            return book;

        }
        public List<Book> GetBooks()
        {
            return Service.GetAll();


        }

        public Book Delete(int id)
        {
            Book b = Service.DeleteById(id);
            return b;
        }
        public Book Put(Book book)
        {
            Book b = Service.Modify(book);
            return b;
        }
    }

}
