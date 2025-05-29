//4) same as above except it has to be done using reference of parent class.

//#include <iostream>
//using namespace std;
//
//class Subject {
//public:
//    virtual void maxmarks() = 0;
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
//void show(Subject& s) {
//    s.maxmarks();
//}
//
//int main() {
//    Maths m;
//    History h;
//    English e;
//
//    show(m);
//    show(h);
//    show(e);
//
//    return 0;
//}
