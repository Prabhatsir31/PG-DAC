// primitive to user defined
/*
when u say "m1=50", following things happen
a) noname object is created (param const)
b) it is assigned to "m1" (assignment operator)
c) noname object is destroyed (destructor)
*/

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
		cout << "In default Const\n";
	}
	/*explicit*/ MyClass(int k)
	{
		cout << endl << "in paramet. cost\n";
		num = k;
	}
	void disp()
	{
		cout << endl << num << endl;
	}
	~MyClass()
	{
		cout << endl << "In Destructor\t" << num << endl;
	}
};
int main()
{
	MyClass m1(30);
	m1.disp();
	m1 = 50; //possible through parameterized constructor,if constructor is not defined as 'explicit'
	m1.disp();
}