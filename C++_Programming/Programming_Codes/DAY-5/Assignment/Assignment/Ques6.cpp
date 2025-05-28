//6) create a Base1 and Base2 classes in the library.
//constructors, member variables and functions you can have in the above classes of your choice.
//now create a client application where you have to create a child class by the name "Sub" of above classes.
//in the main function create an instance of child class and try to access methods of Base1 and Base2.

//#include <iostream>
//using namespace std;
//
//class Base1 {
//public:
//	int num1;
//	Base1(int n1) : num1(n1) {
//		cout << "Base1 constructor called with num1: " << num1 << endl;
//	}
//	void dispBase1() {
//		cout << "Display from Base1: " << num1 << endl;
//	}
//	~Base1() {
//		cout << "Base1 destructor called" << endl;
//	}
//};
//
//class Base2 {
//public:
//	int num2;
//	Base2(int n2) : num2(n2) {
//		cout << "Base2 constructor called with num2: " << num2 << endl;
//	}
//	void dispBase2() {
//		cout << "Display from Base2: " << num2 << endl;
//	}
//	~Base2() {
//		cout << "Base2 destructor called" << endl;
//	}
//};
//
//class Sub : public Base1, public Base2 {
//public:
//	Sub(int n1, int n2) : Base1(n1), Base2(n2) {
//		cout << "Sub constructor called with num1: " << num1 << " and num2: " << num2 << endl;
//	}
//	void dispSub() {
//		cout << "Display from Sub: num1 = " << num1 << ", num2 = " << num2 << endl;
//	}
//	~Sub() {
//		cout << "Sub destructor called" << endl;
//	}
//};
//
//int main() {
//	Sub sub(10, 20);
//	sub.dispBase1();
//	sub.dispBase2();
//	sub.dispSub();
//	return 0;
//}