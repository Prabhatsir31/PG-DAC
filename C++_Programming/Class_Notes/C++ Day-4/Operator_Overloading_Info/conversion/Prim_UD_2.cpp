#include<iostream>
using namespace std;
class MyClass
{
private:
	int num;
public:
	MyClass()
	{
		num = 0;
		cout << endl << "In def. const\n";
	}
	explicit MyClass(int k)
	{
		cout << endl << "in paramet. const\n";
		num = k;
	}
	void disp()
	{
		cout << endl << num << endl;
	}
	// try commenting followin operator= function
	void operator=(int k)
	{
		this->num = k;
		cout << endl << "in =operator function\n";
	}
	~MyClass()
	{
		cout << endl << "in dest\n";
	}
};
int main()
{
	MyClass m1(30);
	m1.disp();
	MyClass m2;
	m2 = 50; //if constructor is defined as 'explicit',we have to overload = operator
	m2.disp();
}