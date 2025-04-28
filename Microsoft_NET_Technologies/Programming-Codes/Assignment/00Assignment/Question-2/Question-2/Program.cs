//Q2.Create a class logicdemo and write 3 static methods
//Fact which find factorial of a number
//Areaofsquare which will find area of a square
//IsOdd method which will print wether given number is odd or not. 

using System;

namespace LogicDemo
{
    public class LogicDemo
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
            //return number % 2 != 0 ? $"{number} is odd" : $"{number} is even";
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Factorial of 5: " + LogicDemo.Fact(5));
            Console.WriteLine("Area of square with side 4: " + LogicDemo.AreaOfSquare(4));
            LogicDemo.IsOdd(7);
        }
    }
}
