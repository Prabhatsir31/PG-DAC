/*operator= doesn't inherit because it performs a constructor-like
activity*/
#include <iostream>
using namespace std;
class base
{
private:
	int a;
public:
	base(int k)
	{
		a=k;
	}
	base()
	{
	}
	int operator+(base &ref)
	{
		cout<<"in base opeator+"<<endl;
		return a+ref.a;

	}
	void operator=(base &ref)
	{
		cout<<"in base operator="<<endl;
		a=ref.a;
	}
	void disp()
	{
		cout<<"Value of a is\t"<<a<<endl;
	}
};
class sub:public base
{
private:
	int b;
public:
	sub(int k)
	{
		b=k;
	}
	void disp()
	{
		cout<<"Value of b is\t"<<b<<endl;
	}
};
int main()
{
	base b1(10),b2(20);
	sub s1(30),s2(40);
	cout<<"b1+b2 is \t"<<b1+b2<<endl;// b1.operator+(b2)
	b1=b2;  // b1.operator=(b2)
	b1.disp();
	cout<<"s1+s2 is \t"<<s1+s2<<endl;  // s1.operator+(s2)
	s1=s2; // s1.operator=(s2)
	s1.disp();

}
/*
In the above code operator+ is inherited , that's why we get
garbage value when we say "s1+s2"
operator= is not inherited, compiler provides operator=  for sub
class, which invokes parent class operator= function*/
