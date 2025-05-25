//User Defined to Primitive
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
	MyClass(int k)
	{
		cout << endl << "in paramet. cost\n";
		num = k;
	}
	void disp()
	{
		cout << endl << num << endl;
	}
	operator int()
	{
		cout << "inside conversion operator function\t" << num << endl;
		return num;
	}
	~MyClass()
	{
		cout << endl << "In dest\n";
	}
};
int main()
{
	MyClass m1(30);
	m1.disp();
	MyClass m2(40);
	m2.disp();
	int val = m2; //this statement invokes casting operator function
	cout << "val after conversion\n" << val << endl;
}