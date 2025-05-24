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
};
int main()
{
	MyClass m1("sachin", 25);
	m1.disp();
	MyClass m2 = m1; // here copy constructor will be called
	m2.disp();

}


/*
in the above case, compiler's copy constructor does shallow copy. It means that content of m1's "name" pointer is copied to m2's name pointer. 
That is we end up both the pointer pointing to same memory location.
when destructor for "m2" is invoked, "delete []name" will deallocate the memory pointed to by "m2" (and also by "m1").
when destructor for "m1" is invoked for a statement "delete []name" there is no memory in heap. "name" pointer of "m1" is a dangling pointer. Hence it will give runtime error.


solution:
	define copy constructor explicitly

MyClass(MyClass &ref)
{
	this->name=new char[strlen(ref.name)+1];
	strcpy_s(this->name,strlen(ref.name)+1,ref.name);
	this->age=ref.age;
}


MyClass m2=m1;


When we should define copy constructor explicitly?

ans:-

when pointer is a member of class

we have allocated memory dynamically

*/