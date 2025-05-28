//4)Define three classes A, B, C carrying one integer member in each of them.Let C be derived from A and B.
//Write constructors and destructors in each of these classes that prompt some message from each class.
//Also the constructor of C should accept three values, one for its own member and other two for A and B.
//The C constructor should see that the two values goes to respective constructors of A and B.
//What is the order in which constructors and destructors get called upon ? How can you change this order ?

//#include <iostream>
//using namespace std;
//
//class A {
//public :
//	int a;
//	A(int x) {
//		a = x;
//		cout << "Constructor of A called with value: " << a << endl;
//	}
//	~A() {
//		cout << "Destructor of A called" << endl;
//	}
//};
//
//class B {
//public:
//	int b;
//	B(int y) {
//		b = y;
//		cout << "Constructor of B called with value: " << b << endl;
//	}
//	~B() {
//		cout << "Destructor of B called" << endl;
//	}
//};
//
//class C : public A, public B {
//public:
//	int c;
//	C(int x, int y, int z) : A(x), B(y), c(z) {
//		cout << "Constructor of C called with value: " << c << endl;
//	}
//	~C() {
//		cout << "Destructor of C called" << endl;
//	}
//};
//
//int main() {
//	C obj(1, 2, 3);
//	cout << "Values: A = " << obj.a << ", B = " << obj.b << ", C = " << obj.c << endl;
//	return 0;
//}