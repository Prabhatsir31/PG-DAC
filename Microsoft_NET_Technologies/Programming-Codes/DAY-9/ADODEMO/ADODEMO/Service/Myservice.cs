using ADODEMO.Models_;
using Microsoft.Extensions.Configuration;
using Microsoft.Data.SqlClient;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ADODEMO.Service
{
    
    internal class Myservice
    {
        internal readonly List<Product> GetProducts;
        string _connectionstring;
        public Myservice(IConfiguration configuration)
        {
            _connectionstring = configuration.GetConnectionString("Default");
        }

        public List<Product> Products
        {
            get
            {
                List<Product> products = new List<Product>();

                using (SqlConnection con = new SqlConnection(_connectionstring))
                {
                    // Pass the connection to the command object, so the command object knows on which
                    // connection to execute the command
                    SqlCommand cmd = new SqlCommand("Select * from Product", con);
                    // Open the connection. Otherwise you get a runtime error. An open connection is
                    // required to execute the command
                    con.Open();
                    Console.WriteLine("connected");
                    SqlDataReader rdr = cmd.ExecuteReader(); //returns object of sqldatareder
                    while (rdr.Read())
                    {
                        Product pd = new Product();
                        pd.ID = Convert.ToInt32(rdr["Id"]);
                        pd.Name = rdr["Name"].ToString();
                        pd.Price = Convert.ToSingle(rdr["Price"]);
                        pd.Qty = Convert.ToInt32(rdr["Qty"]);
                        products.Add(pd);
                    }

                    return products;
                }

            }
        }
    }
}
