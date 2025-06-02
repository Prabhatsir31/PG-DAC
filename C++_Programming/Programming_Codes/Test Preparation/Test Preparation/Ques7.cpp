//7) Given
//class A
//{
//private:
//	int* ptr;  // allocate memory inside heap
//	int len;
//	void disp() {  // incomplete }
//	};
//
//	while creating object of above class pass int array and its length
//		make sure when you call disp, it should display the whole array which was passed while creating array
//		also make sure you can perform following operations on the objects of class A
//		cout << ref1[1];  // ref1 is assumed to be the object of A
//	ref1[0] = 1000;

//#include <iostream>
//using namespace std;
//
//class A {
//private:
//    int* ptr;
//    int len;
//
//public:
//    A(int* arr, int l) {
//        len = l;
//        ptr = new int[len];
//        for (int i = 0; i < len; i++) {
//            ptr[i] = arr[i];
//        }
//    }
//
//    int& operator[](int index) {
//        if (index >= 0 && index < len)
//            return ptr[index];
//        throw out_of_range("Index out of bounds");
//    }
//
//    void disp() const {
//        cout << "Array contents: ";
//        for (int i = 0; i < len; i++) {
//            cout << ptr[i] << " ";
//        }
//        cout << endl;
//    }
//
//    ~A() {
//        delete[] ptr;
//    }
//};
//
//int main() {
//    int arr[] = { 10, 20, 30, 40, 50 };
//    A ref1(arr, 5);
//
//    ref1.disp();
//
//    cout << "ref1[1] = " << ref1[1] << endl;
//
//    ref1[0] = 1000;
//    cout << "After updating ref1[0] = 1000" << endl;
//    ref1.disp();
//
//    return 0;
//}
