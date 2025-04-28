//Q6 Create static class calculator with following method
//a.Public void Add(int a, int b) which will print sum of 2 number.
//b.Public void Add(int a, float b) which will print sum of 2 number.
//c.Public void Add(int a, double b) which will print sum of 2 number.
//d.Public void Add(int a, float b, double d) which will print sum of 3 number.
//From entry point class call these methods


using System;

namespace CalculatorApp
{
    public static class Calculator
    {
        public static void Add(int a, int b)
        {
            Console.WriteLine($"Sum of {a} and {b} is: {a + b}");
        }

        public static void Add(int a, float b)
        {
            Console.WriteLine($"Sum of {a} and {b} is: {a + b}");
        }

        public static void Add(int a, double b)
        {
            Console.WriteLine($"Sum of {a} and {b} is: {a + b}");
        }

        public static void Add(int a, float b, double d)
        {
            Console.WriteLine($"Sum of {a}, {b}, and {d} is: {a + b + d}");
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            Calculator.Add(5, 10);
            Calculator.Add(5, 10.5f);
            Calculator.Add(5, 10.5);
            Calculator.Add(5, 10.5f, 15.5);
        }
    }
}