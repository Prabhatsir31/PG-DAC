//3) create a library for the following class
//MyClass2
//With
//Int num
//Create necessary header file and lib file.
//client should be able to say
//MyClass2 m1(10), m2(20), m3;
//m1.show();
//m3 = m1 + m2;
//m3.show();
//m2 = m1 + 40;
//m2.show();

//#include <iostream>
//using namespace std;
//
//class MyClass2 {
//private:
//	int num;
//public:
//	MyClass2(int k = 0) : num(k) {}
//	void show() const {
//		cout << "Value of num: " << num << endl;
//	}
//	MyClass2 operator+(const MyClass2& other) const {
//		return MyClass2(num + other.num);
//	}
//	MyClass2 operator+(int value) const {
//		return MyClass2(num + value);
//	}
//};
//
//int main() {
//	MyClass2 m1(10), m2(20), m3;
//	m1.show();
//	m3 = m1 + m2;
//	m3.show();
//	m2 = m1 + 40;
//	m2.show();
//	return 0;
//}