using CADB1.Controllers;
using CADB1.Models;
using Microsoft.Extensions.DependencyInjection;
using Microsoft.Extensions.DependencyInjection.Extensions;


namespace CADB1
{
    internal class Program
    {
         private static BookControllerdemo? Controllerobj;

        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");

            var services = new ServiceCollection();

            // Register services with DI container
            services.AddTransient<ISqlrepository, SqlService>();
            services.AddTransient<BookControllerdemo>();
            services.AddTransient<SampleContext>();

            var serviceProvider = services.BuildServiceProvider();

            var Controllerobj = serviceProvider.GetService<BookControllerdemo>();

            Book obj1 = new Book() { Title = "js lang", AuthorId = 2, Isbn = "1234567890" };
            Controllerobj.Add(obj1);

            List<Book> booklist = Controllerobj.GetBooks();
            foreach (Book book in booklist)
            {
                Console.WriteLine(book.Title);
            }

            Book obj2 = new Book() { Title = "js lang", AuthorId = 2, Isbn = "12345678" };
            Controllerobj.Put(obj2);

            booklist = Controllerobj.GetBooks();
            foreach (Book book in booklist)
                Console.WriteLine(book.Title);

            Controllerobj.Delete(4);

            booklist = Controllerobj.GetBooks();
            foreach (Book book in booklist)
                Console.WriteLine(book.Title);
        }

    }
}