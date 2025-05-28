//3)create a class "MyClass1"
//with members and member function "disp1().
//create another class "MyClass2"
//with members and member function "disp2().
//now try to invoke disp1() from disp2()
//in the main() function, create instances of both the classes and invoke their member functions.


//#include <iostream>
//using namespace std;
//
//class MyClass {
//public:
//	void disp1() {
//		cout << "Display from MyClass1" << endl;
//	}
//};
//class MyClass2 {
//public:
//	void disp2(MyClass& obj) {
//		cout << "Display from MyClass2" << endl;
//		obj.disp1();  
//	}
//};
//
//int main() {
//	MyClass obj1;  
//	MyClass2 obj2; 
//	obj1.disp1();  
//	obj2.disp2(obj1);
//	return 0;
//}