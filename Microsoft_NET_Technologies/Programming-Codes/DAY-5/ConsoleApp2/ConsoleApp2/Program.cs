//Create two static methd
 //a.Public static int add(int a, int b) ==return sum of two number
//b. .  Public static int product(int a, int b)==return a * b;
//Declare delegate which can point to this method.
//Using reference of delegate call this method and print result



using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DelegateEx
{
    internal class Program
    {
        public delegate int Operation(int x, int y);

        public static int Add(int a, int b)
        { return a + b; }

        public static int Product(int a, int b)
        { return a * b; }   
        static void Main(string[] args)
        {
            Operation op = Add;

            Console.WriteLine("Additon: " + op(10,4));

            op = Product;

            Console.WriteLine("Product: " + op(10,5));


            Console.ReadLine();
        }
    }
}
