using Microsoft.Extensions.Configuration;
using System;
using System.Collections.Generic;
using Microsoft.Data.SqlClient;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using ADOCURD.Models;

namespace ADOCURD
{
    internal class Productlayer
    {
        private string _connectionstring;
        public Productlayer(IConfiguration configuration)
        {

            _connectionstring = configuration.GetConnectionString("Default");
        }

        public void Products()
        {
            using (SqlConnection con = new SqlConnection(_connectionstring))
            {
                SqlCommand cmd = new SqlCommand("Select * from PADOCrud", con);
               
                try
                {
                    con.Open();
                    Console.WriteLine("connected");
                    SqlDataReader rdr = cmd.ExecuteReader(); 
                    if (rdr.HasRows)
                    {
                        while (rdr.Read())
                        {
                            Console.WriteLine("{0} {1} {2} {3}", rdr[0], rdr["Name"], rdr["Price"], rdr["Qty"]);
                        }
                    }
                }
                catch (Exception ex) { Console.WriteLine(ex); }
            }

        }
        public int product_cnt
        {
            get
            {
                int TotalRows = 0;
                using (SqlConnection connection = new SqlConnection(_connectionstring))
                {

                    try
                    {
                        SqlCommand cmd = new SqlCommand("Select Count(Id) from PADOCrud", connection);
                        connection.Open();
                        
                        TotalRows = (int)cmd.ExecuteScalar();
                    }
                    catch (Exception ex)
                    {
                        Console.WriteLine(ex.Message);
                    }
                }
                return TotalRows;

            }
        }

        public void product_display(string pname)
        {
            using (SqlConnection connection = new SqlConnection(_connectionstring))
            {
                try
                {
                    SqlCommand cmd = new SqlCommand("Select * from PADOCrud where Name like @ProductName", connection);
                    cmd.Parameters.AddWithValue("@ProductName", pname + "%");

                    connection.Open();
                    SqlDataReader rd = cmd.ExecuteReader();

                    while (rd.Read())
                        Console.WriteLine("{0} {1} {2} {3}", rd["Id"], rd["Name"], rd["Price"], rd["Qty"]);
                }

                catch (Exception ex)
                {
                    Console.Write(ex.Message);
                }
            }
        }

        public void product_insert()
        {
            Console.Write("Enter Product ID: ");
            int id = Convert.ToInt32(Console.ReadLine());

            Console.Write("Enter Product Name: ");
            string name = Console.ReadLine();

            Console.Write("Enter Product Price: ");
            decimal price = Convert.ToDecimal(Console.ReadLine());

            Console.Write("Enter Product Quantity: ");
            int qty = Convert.ToInt32(Console.ReadLine());

            using (SqlConnection connection = new SqlConnection(_connectionstring))
            {
                try
                {
                    SqlCommand cmd = new SqlCommand("INSERT INTO PADOCrud (Id, Name, Price, Qty) VALUES (@Id, @Name, @Price, @Qty)", connection);

                    cmd.Parameters.AddWithValue("@Id", id);
                    cmd.Parameters.AddWithValue("@Name", name);
                    cmd.Parameters.AddWithValue("@Price", price);
                    cmd.Parameters.AddWithValue("@Qty", qty);

                    connection.Open();
                    int rowsAffected = cmd.ExecuteNonQuery();
                    Console.WriteLine("Inserted Rows = " + rowsAffected);
                }
                catch (Exception ex)
                {
                    Console.WriteLine(ex.Message);
                }
            }
        }

        public void product_update()
        {
            Console.Write("\nEnter Product ID to Update: ");
            int id = Convert.ToInt32(Console.ReadLine());

            Console.Write("Enter New Product Name: ");
            string name = Console.ReadLine();

            Console.Write("Enter New Product Price: ");
            decimal price = Convert.ToDecimal(Console.ReadLine());

            Console.Write("Enter New Product Quantity: ");
            int qty = Convert.ToInt32(Console.ReadLine());

            using (SqlConnection connection = new SqlConnection(_connectionstring))
            {
                try
                {
                    SqlCommand cmd = new SqlCommand("UPDATE PADOCrud SET Name = @Name, Price = @Price, Qty = @Qty WHERE Id = @Id", connection);

                    cmd.Parameters.AddWithValue("@Id", id);
                    cmd.Parameters.AddWithValue("@Name", name);
                    cmd.Parameters.AddWithValue("@Price", price);
                    cmd.Parameters.AddWithValue("@Qty", qty);

                    connection.Open();
                    int rowsAffected = cmd.ExecuteNonQuery();

                    if (rowsAffected > 0)
                        Console.WriteLine("\nProduct updated successfully.");
                    else
                        Console.WriteLine("Product ID not found.");
                }
                catch (Exception ex)
                {
                    Console.WriteLine(ex.Message);
                }
            }
        }

        public void product_delete()
        {
            Console.Write("\nEnter Product ID to Delete: ");
            int id = Convert.ToInt32(Console.ReadLine());

            using (SqlConnection connection = new SqlConnection(_connectionstring))
            {
                try
                {
                    SqlCommand cmd = new SqlCommand("DELETE FROM PADOCrud WHERE Id = @Id", connection);
                    cmd.Parameters.AddWithValue("@Id", id);

                    connection.Open();
                    int rowsAffected = cmd.ExecuteNonQuery();

                    if (rowsAffected > 0)
                        Console.WriteLine("\nProduct deleted successfully.");
                    else
                        Console.WriteLine("Product ID not found.");
                }
                catch (Exception ex) 
                {
                    Console.WriteLine(ex.Message);
                }
            }
        }

        public void DisplayAllWithLINQ()
        {
            List<Product> products = new List<Product>();

            using (SqlConnection connection = new SqlConnection(_connectionstring))
            {
                try
                {
                    SqlCommand cmd = new SqlCommand("SELECT * FROM PADOCrud", connection);
                    connection.Open();
                    SqlDataReader rd = cmd.ExecuteReader();

                    while (rd.Read())
                    {
                        Product p = new Product
                        {
                            Id = Convert.ToInt32(rd["Id"]),
                            Name = rd["Name"].ToString(),
                            Price = (float)Convert.ToDecimal(rd["Price"]),
                            Qty = Convert.ToInt32(rd["Qty"])
                        };
                        products.Add(p);
                    }
                }
                catch (Exception ex)
                {
                    Console.WriteLine(ex.Message);
                }
            }

            Console.WriteLine("\nAll Products:");
            products.ForEach(p => Console.WriteLine($"Id: {p.Id}, Name: {p.Name}, Price: Rs {p.Price}, Qty: {p.Qty}"));

            Console.WriteLine("\nFiltered Products (Price > 50000):");
            var filtered = products.Where(p => p.Price > 50000);
            foreach (var p in filtered)
                Console.WriteLine($"Id: {p.Id}, Name: {p.Name}, Price: Rs {p.Price}");

            Console.WriteLine("\nSorted by Name:");
            var sortedByName = products.OrderBy(p => p.Name);
            foreach (var p in sortedByName)
                Console.WriteLine($"{p.Name} - Rs {p.Price}");

            Console.WriteLine("\nSorted by Price Descending:");
            var sortedByPrice = products.OrderByDescending(p => p.Price);
            foreach (var p in sortedByPrice)
                Console.WriteLine($"{p.Name} - Rs {p.Price}");

            Console.WriteLine("\nGrouped by Quantity:");
            var grouped = products.GroupBy(p => p.Qty);
            foreach (var group in grouped)
            {
                Console.WriteLine($"Qty: {group.Key}");
                foreach (var p in group)
                    Console.WriteLine($"\t{p.Name} - Rs {p.Price}");
            }

            Console.WriteLine("\nSummary:");
            Console.WriteLine($"Total Products: {products.Count}");
            Console.WriteLine($"Average Price: RS {products.Average(p => p.Price)}");
            Console.WriteLine($"Max Price: Rs {products.Max(p => p.Price)}");
            Console.WriteLine($"Min Price: Rs {products.Min(p => p.Price)}");
        }



    }
}