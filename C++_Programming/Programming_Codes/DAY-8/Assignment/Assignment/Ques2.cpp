//2) create a file.
//store ur names initials in the file(char by char)
//close the file
//open the file in read mode and display all the characters.
//(hint:-use ofstream and ifstream)

//#include <iostream>
//#include <fstream>
//using namespace std;
//
//int main() {
//    const char* filename = "initials.txt";
//
//    // 1. Create and write initials to file
//    ofstream fout(filename);
//    if (!fout) {
//        cerr << "Error creating file.\n";
//        return 1;
//    }
//
//    // Store initials character by character
//    fout.put('P');
//    fout.put('.');
//    fout.put('S');
//    fout.put('.');
//    fout.close();
//
//    // 2. Open the file in read mode and display characters
//    ifstream fin(filename);
//    if (!fin) {
//        cerr << "Error opening file.\n";
//        return 1;
//    }
//
//    cout << "Contents of the file:\n";
//    char ch;
//    while (fin.get(ch)) {
//        cout << ch;
//    }
//    cout << endl;
//
//    fin.close();
//    return 0;
//}
