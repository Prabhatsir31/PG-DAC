#ifndef EMP_H  
#define EMP_H  

#include <iostream>  
#include <string>  
using namespace std;  

class Emp {  
int id;  
string name;  
public:  
Emp(int i = 0, string n = "") : id(i), name(n) {}  
friend ostream& operator<<(ostream& out, const Emp& e) {  
	out << "Emp[id=" << e.id << ", name=" << e.name << "]";  
	return out;  
}  
};  

#endif // EMP_H
