//5)  create a library(mathematics.lib)
//in this library create a class "Math"
//In this class define three functions
//a) to accept number and return double of it.
//b) to accept a number and return square of it.
//c) to accept a number, if it is negative, return positive of it.
//
//make sure that while calling all these functions, client need not create an instance of "Math" class.
//write application to access "Math" class and all its functions.

//#include <iostream>
//using namespace std;
//
//class Math {
//public:
//	static double doubleValue(double num) {
//		return num * 2;
//	}
//	static double squareValue(double num) {
//		return num * num;
//	}
//	static double absoluteValue(double num) {
//		return (num < 0) ? -num : num;
//	}
//};
//
//int main() {
//	double num;
//	cout << "Enter a number: ";
//	cin >> num;
//	cout << "Double of " << num << " is: " << Math::doubleValue(num) << endl;
//	cout << "Square of " << num << " is: " << Math::squareValue(num) << endl;
//	cout << "Absolute value of " << num << " is: " << Math::absoluteValue(num) << endl;
//	return 0;
//}