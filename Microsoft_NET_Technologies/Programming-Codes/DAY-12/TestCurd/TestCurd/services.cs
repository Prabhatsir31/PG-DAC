using Microsoft.Extensions.Configuration;
using System;
using System.Collections.Generic;
using Microsoft.Data.SqlClient;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TestCurd
{
    internal class services
    {
        public string location;
        public services(IConfiguration configuration)
        {
            location = configuration.GetConnectionString("Default");
        }

        public void Printemp()
        {
            using (SqlConnection sw = new SqlConnection(location))
            {
                SqlCommand sqlCommand = new SqlCommand("select * from TestCurd ", sw);
                sw.Open();
                Console.WriteLine("Connected");
                SqlDataReader reader = sqlCommand.ExecuteReader();
                if (reader.HasRows)
                {
                    while (reader.Read())
                    {
                        Console.WriteLine($"Name: {reader["name"]}, Id: {reader["Id"]}, Salary: Rs {reader["salary"]}");
                    }
                }

            }
        }
    }
}
