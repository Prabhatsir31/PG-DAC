//4) create a class Student
//with following members
//char prnno[10];
//char name[20];
//char stream[20];
//
//store the details of 4 students(create an array of 4)
//
//write all these details into file. (fstream)
//
//write a global function show
//void show(char* ptr)
//
//the above function will take prnno as argument and traverse through the file and display the result of that prnno.


//#include <iostream>
//#include <fstream>
//#include <cstring>
//using namespace std;
//
//class Student {
//public:
//    char prnno[10];
//    char name[20];
//    char stream[20];
//
//    void accept() {
//        cout << "Enter PRN No: ";
//        cin >> prnno;
//        cout << "Enter Name: ";
//        cin >> name;
//        cout << "Enter Stream: ";
//        cin >> stream;
//    }
//
//    void display() const {
//        cout << "PRN: " << prnno << ", Name: " << name << ", Stream: " << stream << endl;
//    }
//};
//
//// Global function to search and display by PRN
//void show(const char* ptr) {
//    ifstream fin("students.dat", ios::binary);
//    if (!fin) {
//        cerr << "Error opening file for reading.\n";
//        return;
//    }
//
//    Student s;
//    bool found = false;
//    while (fin.read((char*)&s, sizeof(Student))) {
//        if (strcmp(s.prnno, ptr) == 0) {
//            cout << "Record Found:\n";
//            s.display();
//            found = true;
//            break;
//        }
//    }
//
//    if (!found) {
//        cout << "No record found for PRN: " << ptr << endl;
//    }
//
//    fin.close();
//}
//
//int main() {
//    Student students[4];
//
//    // Accept student details
//    for (int i = 0; i < 4; ++i) {
//        cout << "\nEnter details for student " << i + 1 << ":\n";
//        students[i].accept();
//    }
//
//    // Write students to file
//    ofstream fout("students.dat", ios::binary);
//    if (!fout) {
//        cerr << "Error opening file for writing.\n";
//        return 1;
//    }
//
//    for (int i = 0; i < 4; ++i) {
//        fout.write((char*)&students[i], sizeof(Student));
//    }
//
//    fout.close();
//
//    // Search by PRN
//    char searchPRN[10];
//    cout << "\nEnter PRN to search: ";
//    cin >> searchPRN;
//
//    show(searchPRN);
//
//    return 0;
//}




