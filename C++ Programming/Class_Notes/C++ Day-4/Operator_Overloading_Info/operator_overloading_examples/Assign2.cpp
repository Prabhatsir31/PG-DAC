/* use of = operator overloading */
#include<iostream>
using namespace std;
class MyClass
{
private:
	char* name;
	int age;
public:
	void disp();
	MyClass();
	MyClass(const char*, int);
	~MyClass();
	/*
	MyClass& operator=(MyClass& m1)
	{
		cout << endl << "In side =operator function\n";
		name = new char[strlen(m1.name) + 1];
		strcpy_s(name,strlen(m1.name)+1, m1.name);
		age = m1.age;
		return *this;
	}
	*/
};
MyClass::MyClass()
{
	name = NULL;
	cout << "in side def constructor but outside class\n";
}
MyClass::MyClass(const char* str, int k)
{
	name = new char[strlen(str) + 1];
	strcpy_s(name, strlen(str)+1, str);
	age = k;
	cout << "in parameterized constructor\n";
}

MyClass::~MyClass()
{
	delete[]name;
	cout << "\ninside destructor" << endl;
}
void MyClass::disp()
{
	if (name != NULL)
		cout << endl << name << "\t" << age << endl;
}
int main()
{
	MyClass m1("sachin", 25);
	m1.disp();
	MyClass m2;
	m2 = m1;
	m2.disp();
}
