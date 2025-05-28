//5) create a class Base with "int num1", parameterized constructor and destructor.
//Derive class Sub1 from Base with "int num2", parameterized constructor and destructor.
//Now derive class Sub2 from Sub1 with "int num3", parameterized constructor and destructor.
//in the main function create the object of Sub1 and notice constructor and destructor invocation.

//#include <iostream>
//using namespace std;
//
//class Base {
//public:
//	int num1;
//	Base(int n1) : num1(n1) {
//		cout << "Base constructor called with num1: " << num1 << endl;
//	}
//	~Base() {
//		cout << "Base destructor called" << endl;
//	}
//};
//
//class Sub1 : public Base {
//public:
//	int num2;
//	Sub1(int n1, int n2) : Base(n1), num2(n2) {
//		cout << "Sub1 constructor called with num2: " << num2 << endl;
//	}
//	~Sub1() {
//		cout << "Sub1 destructor called" << endl;
//	}
//};
//
//class Sub2 : public Sub1 {
//public:
//	int num3;
//	Sub2(int n1, int n2, int n3) : Sub1(n1, n2), num3(n3) {
//		cout << "Sub2 constructor called with num3: " << num3 << endl;
//	}
//	~Sub2() {
//		cout << "Sub2 destructor called" << endl;
//	}
//};
//
//int main() {
//	Sub1 sub1(10, 20);
//	cout << "Sub1 values: num1 = " << sub1.num1 << ", num2 = " << sub1.num2 << endl;
//	Sub2 sub2(30, 40, 50);
//	cout << "Sub2 values: num1 = " << sub2.num1 << ", num2 = " << sub2.num2 << ", num3 = " << sub2.num3 << endl;
//	return 0;
//}