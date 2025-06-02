//2) define a class to meet following requirements
//First f1("hello", "welcome");    f1.disp
//First f2 = f1;			f2.disp
//First f3;
//f3 = f1				f3.disp
//make sure neither memory leak nor dangling pointer arises in the code


//#include<iostream> 
//using namespace std;
//
//class First {
//private:
//	string str1;
//	string str2;
//public:
//	First (string s1 = "" , string s2 = "") : str1(s1), str2(s2) {}
//
//	First(const First& other) : str1(other.str1), str2(other.str2) {
//		cout << "Copy consstructor called: " << str1 << ", " << str2 << endl;
//	}
//
//	First& operator=(const First& other) {
//		if (this != &other) {
//			str1 = other.str1;
//			str2 = other.str2;
//			cout << "Assignment operator called: " << str1 << ", " << str2 << endl;
//		}
//		return *this;-
//	}
//	void disp() const {
//		cout << "First object: " << str1 << ", " << str2 << endl;
//	}
//	~First() {
//		cout << "Destructor called for: " << str1 << ", " << str2 << endl;
//	}
//};