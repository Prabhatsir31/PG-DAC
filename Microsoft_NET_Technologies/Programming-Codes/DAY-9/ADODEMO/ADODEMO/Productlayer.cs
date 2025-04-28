using Microsoft.Extensions.Configuration;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using System;


using Microsoft.Data.SqlClient;

using Microsoft.Extensions.Configuration;
namespace ADO01_ConsoleApplication
{
    public class Productlayer
    {
        private string _connectionString;
        public Productlayer(IConfiguration iconfiguration)
        {
            _connectionString = iconfiguration.GetConnectionString("Default");
        }

        public void Products()
        {
            using (SqlConnection con = new SqlConnection(_connectionString))
            {


                //SqlCommand cmd = new SqlCommand("Select * from Product", con);

                try
                {
                    SqlCommand cmd = new SqlCommand("Select * from Product", con);

                    con.Open();
                    Console.WriteLine("connected");
                    SqlDataReader rdr = cmd.ExecuteReader();
                    if (rdr.HasRows)
                    {
                        while (rdr.Read())
                        {
                            Console.WriteLine("{0} {1} {2} {3}", rdr["Id"], rdr["Name"], rdr["Price"], rdr["Qty"]);
                        }
                    }
                }
                catch (Exception ex)
                {
                    Console.WriteLine(ex);
                }
            }

        }

    }
}