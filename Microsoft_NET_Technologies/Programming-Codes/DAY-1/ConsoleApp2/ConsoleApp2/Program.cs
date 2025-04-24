using System;
using System.Security.Cryptography;

namespace demo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string s;
            float a;
            Console.WriteLine("enter any number");
            s = Console.ReadLine();

            a = float.Parse(s);
            Console.WriteLine(a * a);

            //bool a1 = float.TryParse(s, out a);
            //if (a1 == true)
            //{
            //    Console.WriteLine(a * a);
            //}

            //a=Convert.ToSingle(s);
            //Console.WriteLine(a*a);



        }
    }
}
