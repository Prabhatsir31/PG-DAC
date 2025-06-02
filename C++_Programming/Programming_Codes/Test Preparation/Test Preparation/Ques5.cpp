//5) RTTI
//virtual or pure virtual function
//collect child class addresses in parent pointer, child class object in parent reference, 
//array of parent pointers storing addresses of child classes dynamic_cast

//#include <iostream>
//#include <typeinfo>
//using namespace std;
//
//class Base {
//public:
//	virtual void show() {
//		cout << "Base class show function called." << endl;
//	}
//};
//
//class Derived1 : public Base {
//public:
//	void show() override {
//		cout << "Derived1 class show function called." << endl;
//	}
//};
//
//class Derived2 : public Base {
//public:
//	void show() override {
//		cout << "Derived2 class show function called." << endl;
//	}
//};
//
//void demonstrateRTTI(Base* basePtr) {
//	if (Derived1* d1 = dynamic_cast<Derived1*>(basePtr)) {
//		cout << "Object is of type Derived1." << endl;
//		d1->show();
//	}
//	else if (Derived2* d2 = dynamic_cast<Derived2*>(basePtr)) {
//		cout << "Object is of type Derived2." << endl;
//		d2->show();
//	}
//	else {
//		cout << "Object is of unknown type." << endl;
//	}
//}
//
//int main() {
//	Base* basePtr1 = new Derived1();
//	Base* basePtr2 = new Derived2();
//	cout << "Using RTTI to identify object types:" << endl;
//	demonstrateRTTI(basePtr1);
//	demonstrateRTTI(basePtr2);
//	delete basePtr1;
//	delete basePtr2;
//	return 0;
//}