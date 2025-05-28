//3) Given
//class Module1
//{
//	int duration;
//public:
//	Module1(int k)
//	{
//		duration = k;
//	}
//};
//
//class Module2
//{
//	int duration;
//public:
//	Module2(int k)
//	{
//		duration = k;
//	}
//};

//write a global function "check" which will take 2 modules(i.e.Module1 and Module2) and check whether 
// Modules are same or not. call this "check" function from main function.

//#include <iostream>
//using namespace std;
//
//class Module1 {
//	int duration;
//public:
//	Module1(int k) {
//		duration = k;
//	}
//	int getDuration() const {
//		return duration;
//	}
//};
//
//class Module2 {
//	int duration;
//public:
//	Module2(int k) {
//		duration = k;
//	}
//	int getDuration() const {
//		return duration;
//	}
//};
//
//void check(const Module1& m1, const Module2& m2) {
//	if (m1.getDuration() == m2.getDuration()) {
//		cout << "Modules are the same." << endl;
//	}
//	else {
//		cout << "Modules are different." << endl;
//	}
//}
//
//int main() {
//	Module1 mod1(5);
//	Module2 mod2(5);
//
//	check(mod1, mod2);  // Should print "Modules are the same."
//	Module2 mod3(10);
//	check(mod1, mod3);  // Should print "Modules are different."
//	return 0;
//}