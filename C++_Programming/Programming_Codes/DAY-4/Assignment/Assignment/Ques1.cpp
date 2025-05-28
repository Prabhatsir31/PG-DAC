//1) class Number
//{
//    int num;
//}
//In the main function,
//Number n1(8), n2(4), n3(20), n4(6), n5;
//n5 = n1 - n2
//n5 = n3 / n4;
//n5 = n1 * n3

//#include <iostream>
//using namespace std;
//
//class Number {
//    int num;
//
//public:
//    Number(int n = 0) {
//        num = n;
//    }
//
//    // Overload -
//    Number operator-(Number n) {
//        return Number(num - n.num);
//    }
//
//    // Overload /
//    Number operator/(Number n) {
//        return Number(num / n.num);
//    }
//
//    // Overload *
//    Number operator*(Number n) {
//        return Number(num * n.num);
//    }
//
//    void show() {
//        cout << "Value: " << num << endl;
//    }
//};
//
//int main() {
//    Number n1(8), n2(4), n3(20), n4(6), n5;
//
//    n5 = n1 - n2;
//    n5.show();
//
//    n5 = n3 / n4;
//    n5.show();
//
//    n5 = n1 * n3;
//    n5.show();
//
//    return 0;
//}
