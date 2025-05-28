/* if parent class does not have no-arg constructor,
all the constructors of child class should invoke the 
parameterized constructor of parent explicitly.
*/

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
class sub:protected base
{
private:
	int num2;
public:
	sub():base(10)
	{
		cout<<"sub no-arg"<<endl;
	}
	sub(int num2):base(20)
	{
		this->num2=num2;
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
	sub s;
	s.disp2();
	return 0;
}








