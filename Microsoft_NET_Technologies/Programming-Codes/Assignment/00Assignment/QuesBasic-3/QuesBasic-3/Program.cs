//3.	Create a struct draw which has member height, width. It has method  which will return area of a rectangle.
//It has one more method squarearea(int h) it will return area of a square. if Create entry point and print area. 

using System;

namespace Geometry
{
    public struct Draw
    {
        public int Height;
        public int Width;

        public int Area()
        {


            return Height * Width;
        }

        public int SquareArea(int side)
        {
            return side * side;
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            Draw rectangle = new Draw { Height = 5, Width = 10 };
            Console.WriteLine("Area of Rectangle: " + rectangle.Area());
            Console.WriteLine("Area of Square with side 4: " + rectangle.SquareArea(4));
        }
    }
}