using System;
using System.Linq;

namespace ConsoleApp1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int[] a = { 5, 8, 9, 2, 1 };

            // Display all numbers <= 5
            var lessThanOrEqualToFive = from g in a where g <= 5 select g;
            Console.WriteLine("Numbers <= 5: " + string.Join(", ", lessThanOrEqualToFive));

            var lessThanOrEqualToFiveMethod = a.Where(g => g <= 5).Select(g => g);
            Console.WriteLine("Numbers <= 5 (Method Syntax): " + string.Join(", ", lessThanOrEqualToFiveMethod));

            // Display all even numbers
            var evenNumbers = from g in a where g % 2 == 0 select g;
            Console.WriteLine("Even Numbers: " + string.Join(", ", evenNumbers));

            // Display all odd numbers
            var oddNumbers = from g in a where g % 2 != 0 select g;
            Console.WriteLine("Odd Numbers: " + string.Join(", ", oddNumbers));

            // Display all greater than or equal to 8
            var greaterThanOrEqualToEight = from g in a where g >= 8 select g;
            Console.WriteLine("Numbers >= 8: " + string.Join(", ", greaterThanOrEqualToEight));

            string[] str = { "hello", "hii", "go", "bye" };

            // Display strings that start with "h"
            var startsWithH = from g in str where g.StartsWith("h") select g;
            Console.WriteLine("Strings starting with 'h': " + string.Join(", ", startsWithH));

            var startsWithHMethod = str.Where(s => s.StartsWith("h")).Select(s => s);
            Console.WriteLine("Strings starting with 'h' (Method Syntax): " + string.Join(", ", startsWithHMethod));
        }
    }
}