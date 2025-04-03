/*
create abstract class Shape. declare "draw()" function as abstract. From this class define "Triangle","Polygon" and "Circle" .
create an array of Shape having 3 elements.
store child objects into this array . and call
draw function of Polygon only.
*/
package Practice;

abstract class Shape  {
	abstract void draw();
}

class Triangle extends Shape{
	public void draw() {
		System.out.println("Draw Triangle");
	}
}

class Polygon extends Shape{
	public void draw() {
		System.out.println("Draw Polygon");
	}
}

class Circle extends Shape{
	public void draw() {
		System.out.println("Draw Circle");
	}
}

public class Ques6 {
	public static void main(String args[]) {
		Shape[] arr = new Shape[3];
		
		arr[0] = new Triangle();
		arr[1] = new Polygon();
		arr[2] = new Circle();
		
		for(Shape shape: arr) {
			if(shape instanceof Polygon) {
				shape.draw();
			}
		}
	}
}
