//Q3.Solve above program again but this time declare class as static.[utility class]

using System;

namespace LogicDemo
{
    public static class LogicDemo
    {
        public static int Fact(int number)
        {
            if (number == 0) return 1;
            return number * Fact(number - 1);
        }

        public static int AreaOfSquare(int side)
        {
            return side * side;
        }

        public static void IsOdd(int number)
        {
            Console.WriteLine(number % 2 != 0 ? $"{number} is Odd" : $"{number} is Even");
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Factorial of 7: " + LogicDemo.Fact(7));
            Console.WriteLine("Area of square with side 5: " + LogicDemo.AreaOfSquare(5));
            LogicDemo.IsOdd(7);
        }
    }
}