//4) create a class.
//accept from user, how many instances are required.
//Accordingly create array of instances dynamically.
//Now make sure that u call destructor for each and every instances.

//#include <iostream>
//using namespace std;
//
//class Myclass {
//public:
//	Myclass() {
//		cout << "Constructor called\n";
//	}
//	~Myclass() {
//		cout << "Destructor called\n";
//	}
//};
//
//int main() {
//	int n;
//	cout << "Enter the number of instances required: ";
//	cin >> n;
//	Myclass* arr = new Myclass[n];
//	delete[] arr;
//	return 0;
//}