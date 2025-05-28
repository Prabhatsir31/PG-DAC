//2) class parent
//{
//public:
//	disp1()
//		disp2()
//		disp3()
//		disp4()
//};
//class sub :private parent
//{
//public:
//	disp5()
//};
//
//make sure u can do the following
//
//sub s(30);
//s.disp5();
//s.disp3();
//s.disp1();


//#include <iostream>
//using namespace std;
//
//class Parent {
//public:
//	void disp1() {
//		cout << "Display 1 from Parent\n" << endl ;
//	}
//	void disp2() {
//		cout << "Display 2 from Parent\n" << endl;
//	}
//	void disp3() {
//		cout << "Display 3 from Parent\n" << endl;
//	}
//	void disp4() {
//		cout << "Display 4 from Parent\n" << endl;
//	}
//};
//
//class Sub : private Parent {
//public:
//	Sub(int x) {
//		cout << "Sub constructor called with value: " << x << endl;
//	}
//	void disp5() {
//		cout << "Display 5 from Sub\n" << endl;
//	}
//
//	using Parent::disp1; 
//	using Parent::disp3;
//};
//
//int main() {
//	Sub s(30);
//	s.disp5();
//	s.disp3();
//	s.disp1();
//	return 0;
//}
