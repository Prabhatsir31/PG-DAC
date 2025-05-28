//1) class base
//{
//public:
//	base(char* ptr)
//	{
//	}
//};
//class sub :public base
//{
//};
//
//Following statements should be possible
//sub s;
//
//sub* s1 = new sub(40);
//
//sub* s2 = new sub('a', 4.5);

//#include <iostream>
//using namespace std;
//
//class base {
//public:
//    base(char* ptr) {
//        cout << "base(char*) called\n";
//    }
//
//    base() {
//        cout << "base() default constructor\n";
//    }
//
//    base(int x) {
//        cout << "base(int) constructor\n";
//    }
//
//    base(char c, double d) {
//        cout << "base(char, double) constructor\n";
//    }
//};
//
//class sub : public base {
//public:
//    sub() : base() {
//        cout << "sub() constructor\n";
//    }
//
//    sub(int x) : base(x) {
//        cout << "sub(int) constructor\n";
//    }
//
//    sub(char c, double d) : base(c, d) {
//        cout << "sub(char, double) constructor\n";
//    }
//};
//
//int main() {
//    sub s;
//    sub* s1 = new sub(40);
//    sub* s2 = new sub('a', 4.5);
//    delete s1;
//    delete s2;
//    return 0;
//}

