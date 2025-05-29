//2) Create a base class FourWheeler.Declare pure virtual function “void start()” in it.
//Define following sub classes for this class.
//A) Qualis b) Sumo c) Volvo
//Define “start” function in these classes.In main function, create array of pointer to FourWheeler 
//which will contain objects of these three sub classes.
//Now traverse the array and call all the child class methods.

//#include <iostream>
//using namespace std;
//
//class FourWheeler {
//public:
//	virtual void start() = 0; // Pure virtual function
//};
//
//class Qualis : public FourWheeler {
//public:
//	void start() override {
//		cout << "Qualis is starting." << endl;
//	}
//};
//
//class Sumo : public FourWheeler {
//public:
//	void start() override {
//		cout << "Sumo is starting." << endl;
//	}
//};
//
//class Volvo : public FourWheeler {
//public:
//	void start() override {
//		cout << "Volvo is starting." << endl;
//	}
//};
//
//int main() {
//	FourWheeler* vehicles[3]; 
//	vehicles[0] = new Qualis();
//	vehicles[1] = new Sumo();
//	vehicles[2] = new Volvo();
//
//	for (int i = 0; i < 3; ++i) {
//		vehicles[i]->start();
//	}
//
//	for (int i = 0; i < 3; ++i) {
//		delete vehicles[i];
//	}
//	return 0;
//}