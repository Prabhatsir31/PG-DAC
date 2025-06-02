//6)class B
//	int y;
//	void disp2() { how will you access "x" here ? }
//
//	class A
//		int x;
//	void disp1() {}
//
//	do not change the order of above classes

//#include <iostream>
//using namespace std;
//
//class A; 
//
//class B {
//    int y;
//
//public:
//    void disp2(A& a); 
//};
//
//class A {
//    int x;
//
//public:
//    A(int val) : x(val) {}
//    void disp1() {
//        cout << "A::disp1(), x = " << x << endl;
//    }
//
//    friend void B::disp2(A& a); 
//};
//
//void B::disp2(A& a) {
//    cout << "B::disp2(), accessing A::x = " << a.x << endl;
//}
//
//int main() {
//    A a(100);
//    B b;
//
//    a.disp1();
//    b.disp2(a);
//
//    return 0;
//}
