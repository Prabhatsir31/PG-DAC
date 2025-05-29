// 5) create abstract class Shape. declare "draw()" function as abstract. From this class define "Triangle","Polygon" and "Circle" .
// create an array of Shape having 3 elements.
// store child objects into this array . and call
// their draw function.

package InheritanceAssignment;

//Abstract class Shape
abstract class Shape {
 // Abstract method draw
 public abstract void draw();
}

//Class Triangle extending Shape
class Triangle extends Shape {
 @Override
 public void draw() {
     System.out.println("Drawing a Triangle");
 }
}

//Class Polygon extending Shape
class Polygon extends Shape {
 @Override
 public void draw() {
     System.out.println("Drawing a Polygon");
 }
}

//Class Circle extending Shape
class Circle extends Shape {
 @Override
 public void draw() {
     System.out.println("Drawing a Circle");
 }
}

//Class with main function
public class Ques5 {
 public static void main(String[] args) {
     // Create an array of Shape with 3 elements
     Shape[] shapes = new Shape[3];

     // Store child objects into the array
     shapes[0] = new Triangle();
     shapes[1] = new Polygon();
     shapes[2] = new Circle();

     // Call the draw method for each shape
     for (Shape shape : shapes) {
         shape.draw();
     }
 }
}
