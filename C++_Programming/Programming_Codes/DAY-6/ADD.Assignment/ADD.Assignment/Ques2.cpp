//2) class A
//{
//	void fun1()
//	{
//		// invoke "fun2" from here
//	}
//}
//	class B
//	{
//		void fun2()
//		{
//		}
//	};

//#include <iostream>
//using namespace std;
//
//class B; 
//class A {
//public:
//	void fun1(B& b); 
//};
//
//class B {
//public:
//	void fun2() {
//		cout << "Function fun2 called." << endl;
//	}
//};
//
//void A::fun1(B& b) {
//	b.fun2(); 
//}
//
//int main() {
//	A a;
//	B b;
//	a.fun1(b); 
//	return 0;
//}