#include<iostream>
using namespace std;
class base
{
private:
		int num1;
public:
	void disp1()
	{
		cout<<num1<<endl;
	}
	base(int num1)
	{
		this->num1=num1;
		cout<<"base param"<<endl;
	}
	~base()
	{
		cout<<"base destr"<<endl;
	}
}; 
class sub:base
{
private:
	int num2;
public:
	sub()
	{
		cout<<"sub no-arg"<<endl;
	}
	void disp2()
	{
		disp1();
		cout<<num2<<endl;
	}
	~sub()
	{
		cout<<"sub destr"<<endl;
	}
};

int main()
{
	sub s; // base does not have no-arg constru
	s.disp2();
	return 0;
}
