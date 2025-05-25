//1) store value 20 inside "num" variable.
//create a pointer to this variable.print the value of "num" using pointer.
//increment the pointer by 2 and show with the diagram what happens.

//#include<iostream>
//using namespace std;
//
//int main() {
//    int num = 20;
//    int* ptr = &num;
//
//    cout << "Value of num: " << num << endl;
//    cout << "Value via pointer: " << *ptr << endl;
//    cout << "Address in ptr: " << ptr << endl;
//
//    ptr = ptr + 2;
//
//    cout << "After incrementing pointer by 2:" << endl;
//    cout << "New address in ptr: " << ptr << endl;
//
//    cout << "Value at new location (garbage): " << *ptr << endl;
//    return 0;
//}


//Memory Layout Before ptr + 2:
//
//Address      Value     Description
//--------     ------    --------------------------
//1000         20        num
//ptr-------> 1000      (points to num)
//
//🟰 After ptr = ptr + 2:
//
//Address      Value     Description
//--------     ------    --------------------------
//1000         20        num
//1004 ? ? Unknown / garbage
//1008 ? ? Unknown / garbage
//ptr-------> 1008      (points to unknown memory)