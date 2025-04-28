using Microsoft.EntityFrameworkCore;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _01entity.Models
{
    internal class SqlService : ISqlrepository
    {
        SampleContext Context;
        public SqlService(SampleContext context) {
            Context = context;
          }
        public Book AddBook(Book book)
        {
            Context.Books.Add(book);
            Context.SaveChanges();
            return book;
           // throw new NotImplementedException();
        }

        public Book DeleteById(int id)
        {
            Book b=Context.Find<Book>(id);
            Context.Remove(b);
            Context.SaveChanges();
            return b;
        }

        public List<Book> GetAll()
        {
            return Context.Books.ToList();

        }

        public Book GetById(int id)
        {
          //  Context.Books.SingleOrDefault(x=>x.BookId==id);
            return Context.Find<Book>(id);
        }

        public Book Modify(Book book)
        {

           
                Context.Entry(book).State = EntityState.Modified;
                Context.SaveChanges();          


            Book b = Context.Find<Book>(book.BookId);
            Context.Update(b);
            Context.SaveChanges();
            return book;
        }
    }
}
