//3)Create a base class Cricket.Define virtual function �void play()� in it.
//Define following sub classes for this class.A) FiftyOver  b) Test  c) TwentyOver
//�Test� class will have one more function �daywise_summary()�.create a global function �void doit() which accepts 
//reference of type Cricket so that it can invoke �play()� function polymorphically.Inside this function find out 
//where exactly where �Test� is stored using  RTTI(dynamic_cast), and invoke �daywise_summary()� 
//function along with �play()� function.[handle bad_cast exception]


//#include <iostream>
//using namespace std;
//
//class Cricket {
//public:
//	virtual void play() {
//		cout << "Playing cricket" << endl;
//	}
//	virtual ~Cricket() {}
//};
//
//class FiftyOver : public Cricket {
//public:
//	void play() override {
//		cout << "Playing Fifty Over Cricket" << endl;
//	}
//};
//
//class Test : public Cricket {
//public:
//	void play() override {
//		cout << "Playing Test Cricket" << endl;
//	}
//	void daywise_summary() {
//		cout << "Test Cricket Daywise Summary" << endl;
//	}
//};
//
//class TwentyOver : public Cricket {
//public:
//	void play() override {
//		cout << "Playing Twenty Over Cricket" << endl;
//	}
//};
//
//void doit(Cricket& c) {
//	try {
//		c.play();
//		Test* t = dynamic_cast<Test*>(&c);
//		if (t) {
//			t->daywise_summary();
//		}
//		else {
//			throw bad_cast();
//		}
//	}
//	catch (const bad_cast& e) {
//		cout << "Caught bad_cast exception: " << e.what() << endl;
//	}
//}
//
//int main() {
//	Cricket* matches[3];
//	matches[0] = new FiftyOver();
//	matches[1] = new Test();
//	matches[2] = new TwentyOver();
//	for (int i = 0; i < 3; i++) {
//		doit(*matches[i]);
//		delete matches[i];
//	}
//	return 0;
//}