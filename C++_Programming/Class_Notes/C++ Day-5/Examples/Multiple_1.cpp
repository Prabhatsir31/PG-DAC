/* in multiple inheritance constructors are invoked in the order of
inheritance*/

#include<iostream>
using namespace std;
class base1
{
private:
	int num1=10;
public:
	void disp1()
	{
		cout << num1 << endl;
	}
	base1()
	{
		cout << "base1 no-arg" << endl;
	}
	~base1()
	{
		cout << "base1 destr" << endl;
	}
};
class base2
{
private:
	int num2=20;
public:
	void disp2()
	{
		cout << num2 << endl;
	}
	base2()
	{
		cout << "base2 no-arg" << endl;
	}
	~base2()
	{
		cout << "base2 destr" << endl;
	}
};
class base3
{
private:
	int num3=30;
public:
	void disp3()
	{
		cout << num3 << endl;
	}
	base3()
	{
		cout << "base3 no-arg" << endl;
	}
	~base3()
	{
		cout << "base3 destr" << endl;
	}
};
class sub :base1, public base2, protected base3
{
private:
	int num4=40;
public:
	sub()
	{
		cout << "sub no-arg constr" << endl;
	}
	void disp4()
	{
		disp1();
		disp3();
		cout << num4 << endl;
	}
	~sub()
	{
		cout << "sub destr" << endl;
	}
};

int main()
{
	sub s;
	s.disp2();
	s.disp4();
	return 0;
}