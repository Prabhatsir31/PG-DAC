using EntityORM.Models;
using EntityORM.Repository;
using Microsoft.Data.SqlClient;
using Microsoft.EntityFrameworkCore;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EntityORM.Service
{
    public class ServiceBook
    {
        public  SampleContext db;
        internal ServiceBook()
        {
            db = new SampleContext();
        }
        public void Addmany()
        {
            var author = new Author
            {
                FirstName = "William",
                LastName = "Shakespeare",
                Books = new List<Book> { new Book { Title = "Hamlet"},
                                       new Book { Title = "Othello" },
                                        new Book { Title = "MacBeth" }
                             }
            };
            db.Add(author);
            db.SaveChanges();
        }
        public void AddBook(Book obj)
        {
            db.Add(obj);
            db.SaveChanges();
        }
        public void RemoveBook(int Id)
        {
            Book book = db.Books.FirstOrDefault(x => x.BookId == Id);
            if (book != null)
            {
                db.Remove(book); // Book Deleted
                db.SaveChanges();
            }
        }
        public void UpdateBook(Book obj)
        {
            //SampleContext db1 = new SampleContext();
            var existingBook = db.Books.Find(obj.BookId);

            if (existingBook != null)
            {

                db.Entry(existingBook).State = EntityState.Detached;
            }


            db.Update(obj);
            db.SaveChanges();

        }

        public IEnumerable<Book> Display()
        {
            return db.Books.Include((a) => a.Author).ToList<Book>();
        }
        public void Display(string title)
        {
            FormattableString sql = $"SELECT * FROM Books WHERE Title = {title}";
            var book = db.Books.FromSql(sql).FirstOrDefault();
            Console.Write(book.Title);

            var books = db.Books.FromSql($"EXECUTE dbo.GetMostPopularBooks {title}").ToList();
            foreach (var item in books)
            {
                Console.WriteLine($"{item?.Title}, {item?.Author?.FirstName} {item?.Author?.LastName} {item?.BookId}");
            }
            
        }

        public void DeleteAuth(int id)
        {
            var auth = new Author { AuthorId = id };
            db.Remove(auth); // Book Deleted
            db.SaveChanges();


        }


    }
}
