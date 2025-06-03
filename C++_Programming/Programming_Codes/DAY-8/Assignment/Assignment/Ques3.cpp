//3) create a file
//accept numbers from user and store inside the file till user enters 0.
//without closing and reopening a file read all the numbers stored inside the file.
//(Hint: use fstream)

//#include <iostream>
//#include <fstream>
//using namespace std;
//
//int main() {
//    const char* filename = "numbers.txt";
//    fstream file;
//
//    // Open file in read/write mode with truncation
//    file.open(filename, ios::in | ios::out | ios::trunc);
//    if (!file) {
//        cerr << "Failed to open file.\n";
//        return 1;
//    }
//
//    // 1. Accept numbers from user
//    int num;
//    cout << "Enter numbers (0 to stop):\n";
//    streampos writePos = file.tellp(); // Save write position
//    while (true) {
//        cin >> num;
//        if (num == 0)
//            break;
//        file << num << " ";
//    }
//
//    // 2. Reset the file pointer to beginning for reading
//    file.seekg(0); // Move get pointer to start
//
//    // 3. Read and display all numbers
//    cout << "\nNumbers read from file:\n";
//    while (file >> num) {
//        cout << num << " ";
//    }
//    cout << endl;
//
//    file.close();
//    return 0;
//}
