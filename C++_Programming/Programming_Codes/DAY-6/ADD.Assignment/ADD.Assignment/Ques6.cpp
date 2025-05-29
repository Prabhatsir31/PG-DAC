//6) Define a class "StaticDemo"
//with
//private - static variable
//public - static function
//In the main() function, prove that in order to display the value of static variable, no need to create an instance.

//#include <iostream>
//using namespace std;
//
//class StaticDemo {
//private:
//	static int staticVar;
//public:
//	static void displayStaticVar() {
//		cout << "Static variable value: " << staticVar << endl;
//	}
//	static void setStaticVar(int value) {
//		staticVar = value;
//	}
//};
//
//int StaticDemo::staticVar = 0; // Initialize static variable
//int main() {
//	StaticDemo::setStaticVar(42); 
//	StaticDemo::displayStaticVar();
//	return 0;
//}