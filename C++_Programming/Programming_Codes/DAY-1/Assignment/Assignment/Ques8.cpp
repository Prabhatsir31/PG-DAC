//8) ask user how many numbers he would like to store and using DMA allocate the memory 
// for the same[diagram compulsory]

//#include <iostream>
//using namespace std;
//
//int main() {
//	int n;
//	cout << "Enter the number of elements you want to store: ";
//	cin >> n;
//
//	int* arr = new int[n];
//
//	if (arr == nullptr) {
//		cout << "Memory allocation failed!" << endl;
//		return 1; 
//	}
//	
//	cout << "Enter " << n << " numbers:" << endl;
//	for (int i = 0; i < n; i++) {
//		cin >> arr[i];
//	}
//	cout << "You entered:" << endl;
//	for (int i = 0; i < n; i++) {
//		cout << arr[i] << " ";
//	}
//	cout << endl;
//	delete[] arr;
//	return 0;
//}