#include<iostream>
using namespace std;
class MyClass
{
private:
	char* name;
	int age;
public:
	MyClass()
	{
		name = NULL;
		cout << "in side def constructor but outside class\n";
	}
	MyClass(const char* str, int k)
	{
		name = new char[strlen(str) + 1];
		strcpy_s(name, strlen(str) + 1, str);
		age = k;
		cout << "in parameterized constructor\n";
	}
	MyClass(const MyClass& m1)
	{
		name = new char[strlen(m1.name) + 1];
		strcpy_s(name, strlen(m1.name) + 1, m1.name);
		age = m1.age;
		cout << "\ninside copy constructor\n";
	}
	~MyClass()
	{
		delete []name;
		cout << "\ninside destructor\n";
	}
	void disp()
	{
		if(name!=NULL)
		cout << name << "\t" << age << endl;
	}
};
int main()
{
	MyClass m1("sachin", 25);
	m1.disp();
	MyClass m2 = m1; // here copy constructor will be called
	m2.disp();
	MyClass& ref = m2;
	ref.disp();
	MyClass m3 = ref; // here also copy constructor gets called
	m3.disp();
	MyClass m4;
	//m4.disp();  // there will be a problem
}
