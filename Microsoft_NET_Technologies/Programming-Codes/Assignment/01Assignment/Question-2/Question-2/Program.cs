//Q2.Create a class shape which has private member variable Height, width. Write parameterised constructor. It has abstract method area.Public abstract double area();.
//Create 2 child class Rectangle and Triangle. This class has member variable type shape.  Override parent area method and return area of a sharp. Both class has there own method Public void Fill Rectangle and Public void Triangle respectively. This method will print message “Filling color in Rectangle” and  Filling color in Triangle”. Create Array of shape class and store 3 object of each child class. Using Loop call area, Fill Rectangle and Fill Triangle.
//Also Create a static class with static method public void showpoly(Shape p) { }
//job of this method is to call area method.

using System;

public abstract class Shape
{
    protected double Height { get; set; }
    protected double Width { get; set; }

    public Shape(double height, double width)
    {
        Height = height;
        Width = width;
    }

    public abstract double Area();
}

public class Rectangle : Shape
{
    public Rectangle(double height, double width) : base(height, width) { }

    public override double Area() => Height * Width;

    public void FillRectangle() => Console.WriteLine("Filling color in Rectangle");
}

public class Triangle : Shape
{
    public Triangle(double height, double width) : base(height, width) { }

    public override double Area() => 0.5 * Height * Width;

    public void FillTriangle() => Console.WriteLine("Filling color in Triangle");
}

class Program
{
    static void Main()
    {
        Shape[] shapes = new Shape[6];
        shapes[0] = new Rectangle(5, 10);
        shapes[1] = new Rectangle(3, 6);
        shapes[2] = new Rectangle(4, 8);
        shapes[3] = new Triangle(5, 10);
        shapes[4] = new Triangle(3, 6);
        shapes[5] = new Triangle(4, 8);

        foreach (var shape in shapes)
        {
            Console.WriteLine($"Area: {shape.Area()}");
            if (shape is Rectangle rectangle)
            {
                rectangle.FillRectangle();
            }
            else if (shape is Triangle triangle)
            {
                triangle.FillTriangle();
            }
        }
    }
}