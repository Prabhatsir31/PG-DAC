// Q) Para argument to an anonymous method Write anon method which return factorial and sqare of the numbet.
// Use anonymous method and element to find the square of the number

using System;

namespace ConsoleApplication1
{
    class Program
    {
        static void Main(string[] args)
        {

            Func<int, int> fact = delegate (int num)
            {
                int result = 1;
                for (int i = 1; i <= num; i++)
                {
                    result = result * i;
                }
                return result;
            };
            Func<int, int> square = delegate (int num)
            {
                return num * num;
            };
            Console.WriteLine("Factorial of 5 is: " + fact(5)); // Output: 120
            Console.WriteLine("Square of 5 is: " + square(5));       // Output: 25




        }
    }
}
