//4)Create a base class Cricket.Declare pure virtual function “void play()” in it.
//Define following sub classes for this class.A) FiftyOver  b) Test  c) TwentyOver
//“Test” class will have one more function “daywise_summary()”.
//Create an array of pointer to “Cricket” class having 3 elements.Store child class objects into this array.
//Now using  using  RTTI, find out where is  “Test”, and call “daywise_summary()”  along with “play()” function

//#include <iostream>
//using namespace std;
//
//class Cricket {
//public:
//    virtual void play() = 0; 
//    virtual ~Cricket() {}    
//};
//
//class FiftyOver : public Cricket {
//public:
//    void play() override {
//        cout << "Playing 50-over match." << endl;
//    }
//};
//
//class Test : public Cricket {
//public:
//    void play() override {
//        cout << "Playing Test match." << endl;
//    }
//    void daywise_summary() {
//        cout << "Showing day-wise summary of the Test match." << endl;
//    }
//};
//
//class TwentyOver : public Cricket {
//public:
//    void play() override {
//        cout << "Playing T20 match." << endl;
//    }
//};
//
//int main() {
//    Cricket* matches[3];
//    matches[0] = new FiftyOver();
//    matches[1] = new Test();
//    matches[2] = new TwentyOver();
//
//    for (int i = 0; i < 3; ++i) {
//        matches[i]->play();  
//
//        Test* t = dynamic_cast<Test*>(matches[i]);
//        if (t != nullptr) {
//            t->daywise_summary(); // Call extra method
//        }
//    }
//
//    for (int i = 0; i < 3; ++i) {
//        delete matches[i];
//    }
//
//    return 0;
//}
