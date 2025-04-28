//1. Create a class math, it has 2 instance method square and cube both method will return result in float.
//Create entry point class and call these method and print result

using System;

namespace MathOperations
{
    public class Math
    {
        public float Square(float number)
        {
            return number * number;
        }

        public float Cube(float number)
        {
            return number * number * number;
        }
        
    }

    class Program
    {
        static void Main(string[] args)
        {
            Math math = new Math();
            Console.WriteLine("Square of 4: " + math.Square(4));
            Console.WriteLine("Cube of 3: " + math.Cube(3));
        }
    }
}