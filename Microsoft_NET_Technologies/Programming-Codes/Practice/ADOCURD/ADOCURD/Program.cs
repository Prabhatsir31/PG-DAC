using ADOCURD.Models;
using ADOCURD.Service;
using ADOCURD;
using Microsoft.Extensions.Configuration;
using Microsoft.VisualBasic;
using System.ComponentModel;

namespace ADOCURD
{
    internal class Program
    {
        private static IConfiguration _iconfiguration;

        static void Main(string[] args)
        {

            GetAppSettingsFile();
            //Printproduct();
            //displaySQLI();

            //callservice();

            //InsertProduct();
            //callservice();

            //UpdateProduct();
            //callservice();

            //DeleteProduct();
            //callservice();

            DisplayAll();

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
            Console.WriteLine(obj.product_cnt);
        }

        //static void InsertProduct()
        //{
        //    Productlayer obj = new Productlayer(_iconfiguration);
        //    obj.product_insert();
        //}

        //static void UpdateProduct()
        //{
        //    Productlayer obj = new Productlayer(_iconfiguration);
        //    obj.product_update();
        //}

        //static void DeleteProduct()
        //{
        //    Productlayer obj = new Productlayer(_iconfiguration);
        //    obj.product_delete();
        //}

        //static void displaySQLI()
        //{
        //    Productlayer obj = new Productlayer(_iconfiguration);
        //    string s = "LED";
        //    obj.product_display(s);
        //}

        //static void callservice()
        //{
        //    Myservice ms = new Myservice(_iconfiguration);
        //    List<Product> ls = ms.GetProducts;
        //    foreach (Product p in ls)
        //    {
        //        Console.WriteLine($"Id= {p.Id} Name={p.Name} Price={p.Price} Qty={p.Qty}");
        //    }
        //}

        static void DisplayAll()
        {
            Productlayer productlayer = new Productlayer(_iconfiguration);
            productlayer.DisplayAllWithLINQ();
        }


    }
}