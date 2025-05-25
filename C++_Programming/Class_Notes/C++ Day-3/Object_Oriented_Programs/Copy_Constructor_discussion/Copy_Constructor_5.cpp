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
		cout << "in side def constructor but outside class\n";
		name = NULL;
	}
	MyClass(const char* str, int k)
	{
		name = new char[strlen(str) + 1];
		strcpy_s(name, strlen(str) + 1, str);
		age = k;
		cout << "in parameterized constructor\n";
	}
	~MyClass()
	{
		delete[]name;
		cout << "\ninside destructor\n";
	}
	void disp()
	{
		if(name!=NULL)
		cout << name << "\t" << age;
	}
	MyClass(const MyClass& m1) // const MyClass &m1=m1
	{
		name = new char[strlen(m1.name) + 1];
		strcpy_s(name, strlen(m1.name) + 1, m1.name);
		age = m1.age;
		cout << "\ninside copy constructor\n";
	}
};
int main()
{
	MyClass m1("sachin", 25);
	m1.disp();
	MyClass m2 = m1; // here copy constructor will be called
	m2.disp();

}