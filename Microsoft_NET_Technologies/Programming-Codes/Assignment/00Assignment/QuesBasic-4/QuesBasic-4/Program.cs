//4.Create a class Geometry which has 2  member height and width , write parameterised constructor and initialised data.
//Write instance method area which will return area of a rectangle. This class has method area_square(int n) which will
//return area of a square.
//Create entry point and call both methods.


using System;

namespace Geometry
{
    public class Geometry
    {
        private int Height;
        private int Width;

        public Geometry(int height, int width)
        {
            Height = height;
            Width = width;
        }

        public int Area()
        {
            return Height * Width;
        }

        public int AreaSquare(int side)
        {
            return side * side;
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            Geometry rectangle = new Geometry(15, 10);
            Console.WriteLine("Area of Rectangle: " + rectangle.Area());
            Console.WriteLine("Area of Square with side 4: " + rectangle.AreaSquare(4));
        }
    }
}