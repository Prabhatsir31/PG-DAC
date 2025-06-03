//1) create a structure "Product"
//with following members
//
//char* pcode;
//char* name;
//int price;
//int qty
//
//in main function u should be able to say
//
//Product p1("p1", "soap", 100, 20);
//Product p2("p2", "perfume", 300, 50);
//Product p3("p3", "Deo", 200, 100);
//
//cout << p1 << "\t" << p2 << "\t" << p3 << endl;

//#include <iostream>
//#include <cstring>
//using namespace std;
//
//struct Product {
//    char* pcode;
//    char* name;
//    int price;
//    int qty;
//
//    Product(const char* pc, const char* nm, int pr, int q) {
//        size_t len = strlen(pc) + 1;
//        pcode = new char[len];
//        strcpy_s(pcode, len, pc);
//
//        len = strlen(nm) + 1;
//        name = new char[len];
//        strcpy_s(name, len, nm);
//
//        price = pr;
//        qty = q;
//    }
//
//    Product(const Product& other) {
//        size_t len = strlen(other.pcode) + 1;
//        pcode = new char[len];
//        strcpy_s(pcode, len, other.pcode);
//
//        len = strlen(other.name) + 1;
//        name = new char[len];
//        strcpy_s(name, len, other.name);
//
//        price = other.price;
//        qty = other.qty;
//    }
//
//    ~Product() {
//        delete[] pcode;
//        delete[] name;
//    }
//};
//
//ostream& operator<<(ostream& os, const Product& p) {
//    os << "[" << p.pcode << ", " << p.name << ", " << p.price << ", " << p.qty << "]";
//    return os;
//}
//
//int main() {
//    Product p1("p1", "soap", 100, 20);
//    Product p2("p2", "perfume", 300, 50);
//    Product p3("p3", "Deo", 200, 100);
//
//    cout << p1 << "\t" << p2 << "\t" << p3 << endl;
//
//    return 0;
//}

