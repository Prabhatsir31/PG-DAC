//6) given
//int num = 100;
//int* ptr = &num;
//++(*ptr);
//cout << num << endl;
//(*ptr)++;
//cout << num << endl;
//*(ptr++);
//cout << num << endl;
//
//show with the help of diagram what happens in the above code
//

//#include <iostream>
//using namespace std;
//int main() {
//	int num = 100;
//	int* ptr = &num;
//	// Initial state
//	cout << "Initial state:" << endl;
//	cout << "num: " << num << ", ptr: " << ptr << endl;
//	// ++(*ptr);
//	++(*ptr);
//	cout << "After ++(*ptr):" << endl;
//	cout << "num: " << num << ", ptr: " << ptr << endl;
//	// (*ptr)++;
//	(*ptr)++;
//	cout << "After (*ptr)++:" << endl;
//	cout << "num: " << num << ", ptr: " << ptr << endl;
//	// *(ptr++);
//	*(ptr++);
//	cout << "After *(ptr++):" << endl;
//	cout << "num: " << num << ", ptr: " << ptr << endl;
//	return 0;
//}