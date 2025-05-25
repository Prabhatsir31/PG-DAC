//3) create a structure "Employee"
//with members
//int id
//char name[20];
//char desig[20];
//now access it using
//a) array
//b) DMA

//#include <iostream>
//using namespace std;
//
//// Structure definition
//struct Employee {
//    int id;
//    char name[20];
//    char desig[20];
//};
//
//int main() {
//    // ---- Access using Array ----
//    cout << "=== Access using Array ===" << endl;
//    Employee empArray[2]; 
//    for (int i = 0; i < 2; i++) {
//        cout << "Enter ID ";
//		cin >> empArray[i].id;
//		cout << "Enter Name ";
//		cin >> empArray[i].name;
//		cout << "Enter Designation ";
//		cin >> empArray[i].desig;
//    }
//    cout << "\n--- Employee Details (Array) ---\n";
//    for (int i = 0; i < 2; i++) {
//        cout << "ID: " << empArray[i].id
//            << ",\nName: " << empArray[i].name
//            << ",\nDesignation: " << empArray[i].desig << endl;
//    }
//
//    // ---- Access using DMA ----
//    cout << "\n=== Access using Dynamic Memory Allocation ===" << endl;
//    int n;
//    cout << "Enter number of employees: ";
//    cin >> n;
//    Employee* empDMA = new Employee[n];
//    for (int i = 0; i < n; i++) {
//        cout << "Enter ID ";
//		cin >> empDMA[i].id;
//		cout << "Enter Name ";
//		cin >> empDMA[i].name;
//		cout << "Enter Designation ";
//		cin >> empDMA[i].desig;
//    }
//    cout << "\n--- Employee Details (DMA) ---\n";
//    for (int i = 0; i < n; i++) {
//        cout << "ID: " << empDMA[i].id 
//            << ",\nName: " << empDMA[i].name
//            << ",\nDesignation: " << empDMA[i].desig << endl;
//    }
//    delete[] empDMA;
//    return 0;
//}

