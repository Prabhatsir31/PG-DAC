// 9)	Define a class “Shape” with “draw()” function . Now derive  classes like “Circle”, 
// “Polygon”,”Rectangle” etc. from “Shape” and override “draw()” function. Define a class 
// “ShapeDemo” in which  write  main()  function. In the main function create a reference 
// to Shape class referring to any of the sub class. Using this reference, call “draw()” 
// and check the result.

package Day_4;
// Base class
class Shape {
    // Method to be overridden
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

// Derived class Circle
class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Derived class Polygon
class Polygon extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Polygon");
    }
}

// Derived class Rectangle
class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

// Class with main function
public class ShapeDemo {
    public static void main(String[] args) {
        // Create a reference of Shape class referring to Circle
        Shape shape1 = new Circle();
        shape1.draw(); // Output: Drawing a Circle

        // Create a reference of Shape class referring to Polygon
        Shape shape2 = new Polygon();
        shape2.draw(); // Output: Drawing a Polygon

        // Create a reference of Shape class referring to Rectangle
        Shape shape3 = new Rectangle();
        shape3.draw(); // Output: Drawing a Rectangle
    }
}