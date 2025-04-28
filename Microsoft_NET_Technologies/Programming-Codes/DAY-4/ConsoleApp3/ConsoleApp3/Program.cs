//Q1.Create 2 string variable and accept data from user.
//Using equals and == check data entered by user is same or not.
//Print gethashcode for both string .variable
//Also use referenceEquals and observe out put.


using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.InteropServices;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp3
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter the String: ");
            String str1 = Console.ReadLine();

            Console.WriteLine("Enter the Second String: ");
            String str2 = Console.ReadLine();

            Console.WriteLine("\n-------Comparison---------");

            // Using ==

            Console.WriteLine($"Using == : {str1 == str2}");

            // Using Equals()

            Console.WriteLine($"Using Equals() : {str1.Equals(str2)}");

            // GetHashCode

            Console.WriteLine($"HashCode of str1 : {str1.GetHashCode()}");
            Console.WriteLine($"HashCode of str2 : {str2.GetHashCode()}");

            // Using ReferenceEquals()
            Console.WriteLine($"Using ReferenceEquals : {Object.ReferenceEquals(str1, str2)}");

        }
    }
}
