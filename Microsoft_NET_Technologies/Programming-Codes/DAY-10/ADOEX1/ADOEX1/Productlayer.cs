using Microsoft.Extensions.Configuration;
using System;
using System.Collections.Generic;
using Microsoft.Data.SqlClient;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using ADOEX1.Models;

namespace ADOEX1
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
                SqlCommand cmd = new SqlCommand("Select * from Employee", con);
               
                try
                {
                    con.Open();
                    Console.WriteLine("connected");
                    SqlDataReader rdr = cmd.ExecuteReader(); 
                    if (rdr.HasRows)
                    {
                        while (rdr.Read())
                        {
                            Console.WriteLine("{0} {1} {2}", rdr[0], rdr["Name"], rdr["Salary"]);
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
                        SqlCommand cmd = new SqlCommand("Select Count(Id) from Employee", connection);
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
                    SqlCommand cmd = new SqlCommand("Select * from Employee where Name like @ProductName", connection);
                    cmd.Parameters.AddWithValue("@ProductName", pname + "%");

                    connection.Open();
                    SqlDataReader rd = cmd.ExecuteReader();

                    while (rd.Read())
                        Console.WriteLine("{0} {1} {2}", rd["Id"], rd["Name"], rd["Salary"]);
                }

                catch (Exception ex)
                {
                    Console.Write(ex.Message);
                }
            }
        }

        public void product_insert()
        {
            Console.Write("\nEnter Employee ID: ");
            int id = Convert.ToInt32(Console.ReadLine());

            Console.Write("Enter Employee Name: ");
            string name = Console.ReadLine();

            Console.Write("Enter Employee Salary: ");
            decimal salary = Convert.ToDecimal(Console.ReadLine());

            using (SqlConnection connection = new SqlConnection(_connectionstring))
            {
                try
                {
                    SqlCommand cmd = new SqlCommand("INSERT INTO Employee (Id, Name, Salary) VALUES (@Id, @Name, @Salary)", connection);

                    cmd.Parameters.AddWithValue("@Id", id);
                    cmd.Parameters.AddWithValue("@Name", name);
                    cmd.Parameters.AddWithValue("@Salary", salary);

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
            Console.Write("\nEnter Employee ID to Update: ");
            int id = Convert.ToInt32(Console.ReadLine());

            Console.Write("Enter New Employee Name: ");
            string name = Console.ReadLine();

            Console.Write("Enter Employee Salary: ");
            decimal salary = Convert.ToDecimal(Console.ReadLine());

            using (SqlConnection connection = new SqlConnection(_connectionstring))
            {
                try
                {
                    SqlCommand cmd = new SqlCommand("UPDATE PADOCrud SET Name = @Name, Salary = @Salary WHERE Id = @Id", connection);

                    cmd.Parameters.AddWithValue("@Id", id);
                    cmd.Parameters.AddWithValue("@Name", name);
                    cmd.Parameters.AddWithValue("@Salary", salary);

                    connection.Open();
                    int rowsAffected = cmd.ExecuteNonQuery();

                    if (rowsAffected > 0)
                        Console.WriteLine("\nEmployee updated successfully.");
                    else
                        Console.WriteLine("Employee ID not found.");
                }
                catch (Exception ex)
                {
                    Console.WriteLine(ex.Message);
                }
            }
        }

        public void product_delete()
        {
            Console.Write("\nEnter Employee ID to Delete: ");
            int id = Convert.ToInt32(Console.ReadLine());

            using (SqlConnection connection = new SqlConnection(_connectionstring))
            {
                try
                {
                    SqlCommand cmd = new SqlCommand("DELETE FROM Employee WHERE Id = @Id", connection);
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

        //public void DisplayAllWithLINQ()
        //{
        //    List<Product> products = new List<Product>();

        //    using (SqlConnection connection = new SqlConnection(_connectionstring))
        //    {
        //        try
        //        {
        //            SqlCommand cmd = new SqlCommand("SELECT * FROM Employee", connection);
        //            connection.Open();
        //            SqlDataReader rd = cmd.ExecuteReader();

        //            while (rd.Read())
        //            {
        //                Product p = new Product
        //                {
        //                    Id = Convert.ToInt32(rd["Id"]),
        //                    Name = rd["Name"].ToString(),
        //                    Salary = (float)Convert.ToDecimal(rd["Salary"]),
        //                };
        //                products.Add(p);
        //            }
        //        }
        //        catch (Exception ex)
        //        {
        //            Console.WriteLine(ex.Message);
        //        }
        //    }

        //    Console.WriteLine("\nAll Products:");
        //    products.ForEach(p => Console.WriteLine($"Id: {p.Id}, Name: {p.Name}, Salary: Rs {p.Salary}"));

        //    Console.WriteLine("\nFiltered Products (Salary > 50000):");
        //    var filtered = products.Where(p => p.Salary > 50000);
        //    foreach (var p in filtered)
        //        Console.WriteLine($"Id: {p.Id}, Name: {p.Name}, Salary: Rs {p.Salary}");

        //    Console.WriteLine("\nSorted by Name:");
        //    var sortedByName = products.OrderBy(p => p.Name);
        //    foreach (var p in sortedByName)
        //        Console.WriteLine($"{p.Name} - Rs {p.Salary}");

        //    Console.WriteLine("\nSorted by Salary Descending:");
        //    var sortedBySalary = products.OrderByDescending(p => p.Salary);
        //    foreach (var p in sortedBySalary)
        //        Console.WriteLine($"{p.Name} - Rs {p.Salary}");

        //    
        //    Console.WriteLine("\nSummary:");
        //    Console.WriteLine($"Total Products: {products.Count}");
        //    Console.WriteLine($"Average Salary: RS {products.Average(p => p.Salary)}");
        //    Console.WriteLine($"Max Salary: Rs {products.Max(p => p.Salary)}");
        //    Console.WriteLine($"Min Salary: Rs {products.Min(p => p.Salary)}");
        //}



    }
}