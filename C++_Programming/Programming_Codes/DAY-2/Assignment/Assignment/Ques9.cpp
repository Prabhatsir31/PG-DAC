//9)write a function which takes 3 arguments
//variable, pointer and a reference.(any datatype)
//invoke this function and show how "call by value", "call by address" and "call by reference" will work.

//#include <iostream>
//using namespace std;
//
//void display(int var, int* ptr, int& ref) {
//	cout << "Value of variable: " << var << endl; // Call by value
//	cout << "Value pointed by pointer: " << *ptr << endl; // Call by address
//	cout << "Value of reference: " << ref << endl; // Call by reference
//}
//
//int main() {
//	int variable = 10;
//	int pointerValue = 20;
//	int referenceValue = 30;
//	int* pointer = &pointerValue; 
//	int& reference = referenceValue;
//
//	cout << "Before function call:" << endl;
//	cout << "Variable: " << variable << ", Pointer: " << *pointer << ", Reference: " << reference << endl;
//	
//	display(variable, pointer, reference);
//	
//	cout << "After function call:" << endl;
//	cout << "Variable: " << variable << ", Pointer: " << *pointer << ", Reference: " << reference << endl;
//	return 0;
//}