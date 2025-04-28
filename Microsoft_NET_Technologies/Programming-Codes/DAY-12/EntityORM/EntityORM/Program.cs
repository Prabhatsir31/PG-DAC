using EntityORM.Models;
using EntityORM.Service;

namespace EntityORM
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");
            ServiceBook servicebook = new ServiceBook();
            var book = new Book
            {
                Title = "madagascar",
                Author = new Author 
                { 
                    FirstName = "darshan",
                    LastName = "GHUMED" 
                },
                    Isbn = "khvkhvbk"
            }; 
            //Add Author add book 
              servicebook.AddBook(book);

            //Add multiple record
              //servicebook.Addmany();



            var bookup = new Book
            {
                Title = "Test yout skill",
                BookId = 4,
                AuthorId = 2
            };
           // servicebook.UpdateBook(bookup);

            
            //servicebook.RemoveBook(27);
            //servicebook.DeleteAuth(3);

           var d= servicebook.Display();
            foreach (var item in d)
            {
                Console.WriteLine($"{item?.Title}, {item?.Author?.FirstName} {item?.Author?.LastName} {item?.BookId}");
            }

        }
    }
}
