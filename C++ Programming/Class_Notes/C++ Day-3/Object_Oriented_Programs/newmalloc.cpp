#include<iostream>
using namespace std;
class MyClass
{
private:
	char* name;
public:
	MyClass(const char* ptr)
	{
		cout << endl << "In parameterised constructor\n";
		name = new char[strlen(ptr) + 1];
		strcpy_s(name, strlen(ptr) + 1, ptr);
	}
	void disp()
	{
		cout << "Name is\t" << name << endl;
	}
	~MyClass()
	{
		cout << endl << "In destructor\n";
		delete[]name;
	}
};
int main()
{
	/*
		MyClass *m=new MyClass("Sachin");
		m->disp();
		delete m;
		free(m); // it won't call destructor
		*/







	/*

		MyClass *m=(MyClass*)malloc(sizeof(MyClass));
		delete m;  // illegal operation
	*/	

}