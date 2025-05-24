// In this example,we can not use member function for overloading,
// because left hand side operand is not a member function.
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
	}
	MyClass(int k)
	{
		num = k;
	}
	void disp()
	{
		cout << endl << num << endl;
	}
	~MyClass()
	{
		cout << "inside destructor\t" << num << endl;
	}
	friend MyClass operator+(int, MyClass&);
};
MyClass operator+(int x, MyClass& m)
{
	return MyClass(x + m.num);
}

int main()
{
	MyClass m1(20);
	MyClass m2;
	int num = 100;
	m2 = num + m1;
	m2.disp();
}