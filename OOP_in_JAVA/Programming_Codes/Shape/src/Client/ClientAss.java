
package Client;

import ShapeDemo.*; // Import the Shape interface


public class ClientAss {
    public static void main(String[] args) {
        // Create an array of Shape with 3 elements
        Shape[] shapes = new Shape[3];
        
        // Store objects of Triangle, Rectangle, and Circle in the array
        shapes[0] = new Triangle();
        shapes[1] = new Rectangle();
        shapes[2] = new Circle();
        
        // Traverse the array and invoke draw() of each shape
        for (int i = 0; i < shapes.length; i++) {
            shapes[i].draw(); // Call draw() on each shape
        }
    }
}