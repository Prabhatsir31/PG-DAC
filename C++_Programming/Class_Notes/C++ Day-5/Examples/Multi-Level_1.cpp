#include<iostream>
using namespace std;
class base
{
private:
	int num1=10;
protected:
	int var=20;
public:
	void disp1()
	{
		cout << num1 << "\t" << var << endl;
	}
	base(int num1)
	{
		this->num1 = num1;
		var = 100;
		cout << "base param" << endl;
	}
	~base()
	{
		cout << "base destr" << endl;
	}
};
class sub1 :protected base
{
private:
	int num2=30;
public:
	sub1() :base(0)
	{
		cout << "sub1 no-arg constr" << endl;
	}
	void disp2()
	{
		disp1();
		cout << num2 << endl;
		cout << "var is\t" << var << endl; // var will come as private
	}
	~sub1()
	{
		cout << "sub1 destr" << endl;
	}
};
class sub2 :sub1
{
private:
	int num3=40;
public:
	sub2(int num3)
	{
		this->num3 = num3;
		cout << "sub2 param constr" << endl;
	}
	void disp3()
	{
		cout << num3 << endl;
		cout << var << endl;
		disp1();
		disp2();
	}
	~sub2()
	{
		cout << "sub2 destr" << endl;
	}
};
class sub3 :public sub2
{
private:
	int num4=50;
public:
	sub3() :sub2(6)
	{
		this->num4 = num4;
		cout << "sub3 param constr" << endl;
	}
	void disp4()
	{
		cout << num4 << endl;
	}
	~sub3()
	{
		cout << "sub3 destr" << endl;
	}
};
int main()
{
	sub3 s;
	s.disp3();
	s.disp4();
	return 0;
}