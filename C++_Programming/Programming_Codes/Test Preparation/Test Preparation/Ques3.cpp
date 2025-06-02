//3) define a class “Voter”, its members should be int id, char* name, char* address.
//Define input(), show() methods
//
//Accept from user, how many voters he has .
//[DMA]				Depending upon that, allocate the memory, invoke input() and get the data from user.
//Now invoke show method for all the objects created.make sure neither memory leak nor dangling pointer arises 
// in the code

//#include<iostream>
//using namespace std;
//
//class Voter {
//private:
//	int id;
//	char* name;
//	char* address;
//public:
//	Voter() : id(0), name(nullptr), address(nullptr) {}
//	~Voter() {
//		delete[] name;
//		delete[] address;
//	}
//	void input() {
//		cout << "Enter voter ID: ";
//		cin >> id;
//		cin.ignore();
//		cout << "Enter voter name: ";
//		name = new char[100];
//		cin.getline(name, 100);
//		cout << "Enter voter address: ";
//		address = new char[100];
//		cin.getline(address, 100);
//	}
//	void show() const {
//		cout << "Voter ID: " << id << endl;
//		cout << "Voter Name: " << (name ? name : "N/A") << endl;
//		cout << "Voter Address: " << (address ? address : "N/A") << endl;
//	}
//};
//
//int main() {
//	int n;
//	cout << "Enter number of voters: ";
//	cin >> n;
//	cin.ignore(); 
//	Voter* voters = new Voter[n];
//
//	for (int i = 0; i < n; i++) {
//		cout << "Entering details for voter " << (i + 1) << ":" << endl;
//		voters[i].input();
//	}
//
//	cout << "\nVoter Details:" << endl;
//	
//	for (int i = 0; i < n; i++) {
//		cout << "\nDetails of voter " << (i + 1) << ":" << endl;
//		voters[i].show();
//	}
//	delete[] voters; 
//	return 0;
//}