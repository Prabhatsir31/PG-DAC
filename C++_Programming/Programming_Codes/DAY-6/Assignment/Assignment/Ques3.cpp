//3) Create a base class “Subject”.Declare pure virtual function “void maxmarks()” in it.
//Define following sub classes for this class.A) Maths b) History c) English.Define “maxmarks” in these classes.
//now write a global function "show" which will accept "subject class pointer" as an argument. 
//this function should be able to call "maxmarks()" of any child class which is passed.
//From main function try to call this function by passing various child classes.

//#include <iostream>
//using namespace std;
//
//
//class Subject {
//public:
//	virtual void maxmarks() = 0;
//};
//
//class Maths : public Subject {
//public:
//	void maxmarks() override {
//		cout << "Maths max marks: 100" << endl;
//	}
//};
//
//class History : public Subject {
//public: 
//	void maxmarks() override {
//		cout << "History max marks: 80" << endl;
//	}
//};
//
//class English : public Subject {
//public:
//	void maxmarks() override {
//		cout << "English max marks: 60" << endl;
//	}
//};
//
//void show(Subject* s) {
//	s->maxmarks();
//}
//
//int main() {
//	Maths m;
//	History h;
//	English e;
//
//	show(&m);
//	show(&h);
//	show(&e);
//
//	return 0;
//}