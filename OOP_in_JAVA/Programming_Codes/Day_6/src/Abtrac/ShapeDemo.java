/*
create abstract class "Shape" with
	a contract "draw()" and concrete behaviour "show()"

create 3 child classes
	Triangle, Rectangle and Circle

define a class "ShapeDemo" with main
inside main create an array of "Shape" of 3 elements. Store all the child class objects inside the array, traverse it 
and invoke "draw()" and "show()" methods polymorphically.

*/
package Abtrac;

abstract class Shape{
	public abstract void draw();
	
	public void show() {
		System.out.println("This is a shape.");
	}
}

class Triangle extends Shape {
	public void draw() {
		System.out.println("Drawing a Triangle.");
	}
}

class Rectangle extends Shape {
	public void draw() {
		System.out.println("Drawing a Rectangle.");
	}
}

class Circle extends Shape {
	public void draw() {
		System.out.println("Drawing a Circle.");
	}
}


public class ShapeDemo {
	public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Triangle();
        shapes[1] = new Rectangle();
        shapes[2] = new Circle();
        for (Shape shape : shapes) {
            shape.draw(); 
            shape.show(); 
            System.out.println();
        }
    }
}
