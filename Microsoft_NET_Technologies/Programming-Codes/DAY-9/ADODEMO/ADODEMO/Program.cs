using ADO01_ConsoleApplication;
using ADODEMO.Models_;
using ADODEMO.Service;
using Microsoft.Extensions.Configuration;


namespace ADODEMO
{
    internal class Program
    {
        private static IConfiguration _iconfiguration; 
        
        static void Main(string[] args)
        {
            GetAppSettingsFile();
            Printproduct();
            displaySQLI();
            callservice();
        }

        static void GetAppSettingsFile()
        {
            var builder = new ConfigurationBuilder()
            .SetBasePath(Directory.GetCurrentDirectory())
            .AddJsonFile("appsettings.json", optional: false, reloadOnChange: true);
            _iconfiguration = builder.Build();
            Console.WriteLine(Directory.GetCurrentDirectory());
        }

        static void Printproduct()
        {
            Productlayer obj = new Productlayer(_iconfiguration);
            obj.Products();
        }

        static void displaySQLI()
        {
            Productlayer obj = new Productlayer(_iconfiguration);
            string s = "LED";
            obj.Products(s);
        }

        static void callservice()
        {
            Myservice ms = new Myservice(_iconfiguration);
            List<Product> ls = ms.GetProducts;
            foreach (Product p in ls)
            {
                Console.WriteLine($"Id= {p.ID} Name= {p.Name} Price= {p.Price} Qty={p.Qty}");
            }
            }
        }
    }
