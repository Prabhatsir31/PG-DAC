//5) create an abstract class Shape with
//virtual void display()
//{
//	cout << "display on the canvas" << endl;
//}
//and
//pure virtual function(contract) void draw()
//functions.
//now derive 3 classes from Shape
//Circle, Triangle and Rectangle
//in the main function create array of pointer to Shape class and store all the child class objects 
// addresses inside it.Traverse the array and invoke "display()" and "draw()" functions.

//#include <iostream>
//using namespace std;
//
//class Shape {
//public:
//	virtual void display() = 0;     
//	virtual void draw() = 0;                    
//};
//
//class Circle : public Shape {
//public:
//	void display() override {
//		cout << "Displaying Circle on the canvas." << endl;
//	}
//	void draw() {
//		cout << "Drawing Circle." << endl;
//	}
//};
//
//class Triangle : public Shape {
//public:
//	void display() override {
//		cout << "Displaying Triangle on the canvas." << endl;
//	}
//	void draw() {
//		cout << "Drawing Triangle." << endl;
//	}
//};
//
//class Rectangle : public Shape {
//public:
//	void display() override {
//		cout << "Displaying Rectangle on the canvas." << endl;
//	}
//	void draw() {
//		cout << "Drawing Rectangle." << endl;
//	}
//};
//
//int main() {
//	Shape* shapes[3];
//	shapes[0] = new Circle();
//	shapes[1] = new Triangle();
//	shapes[2] = new Rectangle();
//
//	for (int i = 0; i < 3; i++) {
//		shapes[i]->display();
//		shapes[i]->draw();
//		delete shapes[i]; // Clean up memory
//	}
//	return 0;
//}