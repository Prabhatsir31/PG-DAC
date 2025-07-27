//create abstract class Shape. declare "draw()" function as abstract. From this class define 
//"Triangle","Polygon" and "Circle" .
//create an array of Shape having 3 elements.
//store child objects into this array . and call
//draw function of Polygon only.

abstract class Shape {
	abstract void draw();
}

class Triangle extends Shape {
	void draw() {
		System.out.println("Draw Triangle");
	}
}

class Polygon extends Shape {
	void draw() {
		System.out.println("Draw Polygon");
	}
}

class Circle extends Shape {
	void draw() {
		System.out.println("Draw Circle");
	}
}

public class ShapeDemo {
	public static void main(String args[]) {
		Shape[] shapes = new Shape[3];
		shapes[0] = new Triangle();
		shapes[1] = new Polygon();
		shapes[2] = new Circle();
		
		shapes[1].draw();
	}
}
