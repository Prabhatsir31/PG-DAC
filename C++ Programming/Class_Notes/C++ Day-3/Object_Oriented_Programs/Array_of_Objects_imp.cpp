#include<iostream>
using namespace std;
class MyClass
{
public:
	MyClass()
	{
		cout << "default constructor" << endl;
	}
	MyClass(int k)
	{
		cout << "param constructor" << endl;
	}
	~MyClass()
	{
		cout << "inside destructor" << endl;
	}
};

int main()
{
	
	//MyClass arr[3];
	//MyClass arr[3] = { MyClass(10),MyClass(20),MyClass(30) };
	
	/*
	MyClass* ptr1 = new MyClass[3];
	delete []ptr1;
	*/

	/*
	MyClass* ptr2 = new MyClass[3]{ MyClass(10),MyClass(20),MyClass(30) };
	delete[]ptr2;
	*/
}