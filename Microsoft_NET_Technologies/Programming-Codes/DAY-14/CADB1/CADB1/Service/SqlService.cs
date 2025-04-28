using CADB1.Models;
using Microsoft.EntityFrameworkCore;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CADB1.Models
{
    internal class SqlService : ISqlrepository
    {
        SampleContext Context;
        public SqlService(SampleContext context)
        {
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
            Book b = Context.Find<Book>(id);

            if (b != null)
            {
                Context.Remove(b);
                Context.SaveChanges();
                return b;
            }
            else
            {
                Console.WriteLine($"Book with ID {id} not found.");
                return null;
            }
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
            var existingBook = Context.Books.Find(book.BookId);

            if (existingBook != null)
            {
                existingBook.Title = book.Title;
                existingBook.Isbn = book.Isbn;
                existingBook.AuthorId = book.AuthorId;

                Context.SaveChanges();
                return existingBook; 
            }
            else
            {
                Console.WriteLine($"Book with ID {book.BookId} not found.");
                return null; 
            }
        }

    }
}
