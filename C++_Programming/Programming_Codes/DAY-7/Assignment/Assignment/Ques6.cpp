//6)Create a base class “Subject”.Declare pure virtual function “void maxmarks()” in it.
//Define following sub classes for this class.A) Maths b) History c) English.Define “maxmarks” in these classes.
//In main function, create array of pointer to Subject, which will contain objects of these three sub classes.
//Using RTTI, find out where is “History” and call its maxmarks() method

//#include <iostream>
//using namespace std;
//
//class Subject {
//public:
//    virtual void maxmarks() = 0;
//    virtual ~Subject() {}
//};
//
//class Maths : public Subject {
//public:
//    void maxmarks() override {
//        cout << "Maths max marks: 100" << endl;
//    }
//};
//
//class History : public Subject {
//public:
//    void maxmarks() override {
//        cout << "History max marks: 80" << endl;
//    }
//};
//
//class English : public Subject {
//public:
//    void maxmarks() override {
//        cout << "English max marks: 90" << endl;
//    }
//};
//
//int main() {
//    Subject* subjects[3];
//    subjects[0] = new Maths();
//    subjects[1] = new History();
//    subjects[2] = new English();
//
//    for (int i = 0; i < 3; i++) {
//        History* h = dynamic_cast<History*>(subjects[i]);
//        if (h) {
//            h->maxmarks();
//        }
//    }
//
//    for (int i = 0; i < 3; i++) {
//        delete subjects[i];
//    }
//
//    return 0;
//}
