using Microsoft.Extensions.Configuration;
using System;
using System.Collections.Generic;
using Microsoft.Data.SqlClient;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ADODEMO1
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
                // Pass the connection to the command object, so the command object knows on which
                // connection to execute the command


                SqlCommand cmd = new SqlCommand("Select * from Product", con);
                // Open the connection. Otherwise you get a runtime error. An open connection is
                // required to execute the command
                try
                {
                    con.Open();
                    Console.WriteLine("connected");
                    SqlDataReader rdr = cmd.ExecuteReader(); //returns object of sqldatareder
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
        public int Product_cnt
        {
            get
            {
                int TotalRows = 0;
                using (SqlConnection connection = new SqlConnection(_connectionstring))
                {

                    try
                    {
                        SqlCommand cmd = new SqlCommand("Select Count(Id) from Product", connection);
                        connection.Open();
                        //As the T-SQL statement that we want to execute return a single value, 
                        //use ExecuteScalar() method of the command object.
                        //Since the return type of ExecuteScalar() is object, we are type casting to int datatype
                        TotalRows = (int)cmd.ExecuteScalar();
                    }
                    catch (Exception ex)
                    {
                        // Handle Exceptions, if any
                        Console.WriteLine(ex.Message);
                    }
                }
                return TotalRows;

            }
        }

        public void product_insert()
        {
            using (SqlConnection connection = new SqlConnection(_connectionstring))
            {
                try
                {
                    //Create an instance of SqlCommand class, specifying the T-SQL command 
                    //that we want to execute, and the connection object.
                    SqlCommand cmd = new SqlCommand("insert into Product values (3, 'Iphone', 750000, 2)", connection);
                    connection.Open();
                    //Since we are performing an insert operation, use ExecuteNonQuery() 
                    //method of the command object. ExecuteNonQuery() method returns an 
                    //integer, which specifies the number of rows inserted
                    int rowsAffected = cmd.ExecuteNonQuery();
                    Console.WriteLine("Inserted Rows = " + rowsAffected);

                    //Set to CommandText to the update query. We are reusing the command object, 
                    //instead of creating a new command object
                    cmd.CommandText = "update Product set Price= 15000 where Id = 2";
                    //use ExecuteNonQuery() method to execute the update statement on the database
                    rowsAffected = cmd.ExecuteNonQuery();
                    Console.WriteLine("Updated Rows = " + rowsAffected);

                    //Set to CommandText to the delete query. We are reusing the command object, 
                    //instead of creating a new command object
                    cmd.CommandText = "Delete from Product where Id = 1";
                    //use ExecuteNonQuery() method to delete the row from the database
                    rowsAffected = cmd.ExecuteNonQuery();
                    Console.WriteLine("Deleted Rows = " + rowsAffected);

                }
                catch (Exception ex)
                {
                    // Handle Exceptions, if any
                    Console.WriteLine(ex.Message);
                }
            }

        }
        public void displayproduct(string pname)//"T"
        {
            using (SqlConnection connection = new SqlConnection(_connectionstring))
            {
                try
                {  //"v'; Delete from Product;Select * from Product where Name like 'v"

                    //Build the query dynamically, by concatenating the text, that the user has 
                    //typed into the ProductNameTextBox. This is a bad way of constructing
                    //queries. This line of code will open doors for sql injection attack
                    // Select* from Product where Name like 'T%';
                    SqlCommand cmd = new SqlCommand("Select * from Product where Name like @ProductName", connection);
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
    }
}