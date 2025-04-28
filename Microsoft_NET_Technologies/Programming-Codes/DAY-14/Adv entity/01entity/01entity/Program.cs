using _01entity.Controllers;
using _01entity.Models;
using Microsoft.Extensions.DependencyInjection;
using Microsoft.Extensions.DependencyInjection.Extensions;


namespace _01entity
{
    internal class Program
    {
       // private static BookControllerdemo Controllerobj;
        
        static void Main(string[] args)
        { 

            Console.WriteLine("Hello, World!");
            var services = new ServiceCollection();
           // create object per request
                 services.AddTransient<ISqlrepository, SqlService>();
              services.AddTransient<BookControllerdemo>();
              services.AddTransient<SampleContext>();


          //  services.Add(new ServiceDescriptor(typeof(ISqlrepository), new SqlService(new SampleContext()));

            var serviceProvider = services.BuildServiceProvider();
           

             BookControllerdemo Controllerobj = serviceProvider.GetService<BookControllerdemo>();

                 services.Add(new ServiceDescriptor(typeof(ISqlrepository), SqlService,ServiceLifetime.Singleton))


            Book obj1 = new Book() { Title = "js lang", AuthorId = 2 };
            Controllerobj.Add(obj1);

            List<Book> booklist = Controllerobj.GetBooks();

            foreach (Book book in booklist)
                Console.WriteLine(book.Title);

            Book obj2 = new Book() { Title = "php", BookId = 2 };
            Controllerobj.Put(obj2);

           booklist = Controllerobj.GetBooks();

            foreach (Book book in booklist)
                Console.WriteLine(book.Title);
            Controllerobj.Delete(6);

         booklist = Controllerobj.GetBooks();

            foreach (Book book in booklist)
                Console.WriteLine(book.Title);


        }
    }
}