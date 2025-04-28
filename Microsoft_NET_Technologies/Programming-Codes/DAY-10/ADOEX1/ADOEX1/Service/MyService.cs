using Microsoft.Data.SqlClient;
using Microsoft.Extensions.Configuration;
using ADOEX1.Models;

namespace ADOEX1.Service
{
    internal class Myservice
    {
        string _connectionstring;
        public Myservice(IConfiguration configuration)
        {
            _connectionstring = configuration.GetConnectionString("Default");

        }

        public List<Product> GetProducts
        {


            get
            {
                List<Product> products = new List<Product>();

                using (SqlConnection con = new SqlConnection(_connectionstring))
                {

                    SqlCommand cmd = new SqlCommand("Select * From Employee", con);
                    con.Open();

                    SqlDataReader rdr = cmd.ExecuteReader();
                    while (rdr.Read())
                    {
                        Product product = new Product();
                        product.Id = Convert.ToInt32(rdr["Id"]);
                        product.Name = rdr["Name"].ToString();
                        product.Salary = Convert.ToSingle(rdr["Salary"]);
                        products.Add(product);

                    }
                    return products;
                }
            }

        }

    
    }
}
