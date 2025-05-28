#include<iostream>
using namespace std;
class base
{
public:
	virtual void disp() // overridden
	{
		cout<<"base disp"<<endl;
	}
};
class sub:public base
{
public:
	void disp() // overriding 
	{
		cout<<"sub disp"<<endl;
	}
};
int main()
{
	base b1;
	sub s1;
	base &ref1=b1;
	ref1.disp();  // referent will be considered
	base &ref2=s1;  // upcasting
	ref2.disp();  // referent will be considered
	return 0;
}

