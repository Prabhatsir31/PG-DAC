using ADODEMO1.Models;
using ADODEMO1.Service;
using Microsoft.Extensions.Configuration;
using Microsoft.VisualBasic;
using System.ComponentModel;

namespace ADODEMO1
{
    internal class Program
    {
        private static IConfiguration _iconfiguration;

        static void Main(string[] args)
        {

            GetAppSettingsFile();
            //Printproduct();
            //displaySQLI();
            callservice();
            //string s = "\"Hello\"";
            //Display(s);
        }
        static void Display(string s)
        {
            Console.WriteLine(s);
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
            Console.WriteLine(obj.Product_cnt);
            //  obj.product_insert();
        }
        static void displaySQLI()
        {
            Productlayer obj = new Productlayer(_iconfiguration);
            string s = "LED";
            obj.displayproduct(s);
        }


        static void callservice()
        {
           Myservice ms=new Myservice(_iconfiguration);
           List<Product> ls =ms.GetProducts;
            foreach (Product p in ls)
            {
                Console.WriteLine($"Id= {p.Id} Name={p.Name} Price={p.Price} Qty={p.Qty}");
            }
        }
    }
}