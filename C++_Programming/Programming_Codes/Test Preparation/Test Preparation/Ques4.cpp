//4) Sample s1(10)
//
//s1 - 300
//
//s1 = 600
//
//int data = s1
//s1 + s2
//++s1
//s1++
//s1 += 20
//100 + s1
//
//cin >> s1
//cout << s1

//#include <iostream>
//using namespace std;
//
//class Sample {
//    int val;
//
//public:
//    Sample(int v = 0) : val(v) {}
//
//    // Type conversion to int
//    operator int() const {
//        return val;
//    }
//
//    // Assignment from int
//    Sample& operator=(int v) {
//        val = v;
//        return *this;
//    }
//
//    // Addition of two Sample objects
//    Sample operator+(const Sample& other) const {
//        return Sample(val + other.val);
//    }
//
//    // Pre-increment
//    Sample& operator++() {
//        ++val;
//        return *this;
//    }
//
//    // Post-increment
//    Sample operator++(int) {
//        Sample temp = *this;
//        val++;
//        return temp;
//    }
//
//    // += operator
//    Sample& operator+=(int v) {
//        val += v;
//        return *this;
//    }
//
//    // Friend function for int + Sample
//    friend Sample operator+(int x, const Sample& s);
//
//    // Stream insertion
//    friend ostream& operator<<(ostream& out, const Sample& s);
//
//    // Stream extraction
//    friend istream& operator>>(istream& in, Sample& s);
//};
//
//    // int + Sample
//    Sample operator+(int x, const Sample& s) {
//        return Sample(x + s.val);
//    }
//
//    // Output
//    ostream& operator<<(ostream& out, const Sample& s) {
//        out << s.val;
//        return out;
//    }
//
//    // Input
//    istream& operator>>(istream& in, Sample& s) {
//        in >> s.val;
//        return in;
//    }
//
//int main() {
//    Sample s1(10), s2(20);
//
//    cout << "s1 - 300 = " << (int)s1 - 300 << endl;
//
//    s1 = 600;
//    cout << "s1 = 600 => " << s1 << endl;
//
//    int data = s1;
//    cout << "int data = s1 => " << data << endl;
//
//    Sample s3 = s1 + s2;
//    cout << "s1 + s2 = " << s3 << endl;
//
//    ++s1;
//    cout << "++s1 = " << s1 << endl;
//
//    s1++;
//    cout << "s1++ = " << s1 << endl;
//
//    s1 += 20;
//    cout << "s1 += 20 = " << s1 << endl;
//
//    Sample s4 = 100 + s1;
//    cout << "100 + s1 = " << s4 << endl;
//
//    cout << "Enter value for s1: ";
//    cin >> s1;
//    cout << "s1 = " << s1 << endl;
//
//    return 0;
//}