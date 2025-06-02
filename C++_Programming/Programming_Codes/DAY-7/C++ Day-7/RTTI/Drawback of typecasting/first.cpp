#include<iostream>
using namespace std;
class base
{
public:
	virtual void disp()
	{
		cout<<endl<<"in base disp\n";
	}
	
};
class sub1:public base
{
public:
	void disp()
	{
		cout<<endl<<"in sub1 disp\n";
	}
	void print1()
	{
		cout<<endl<<"in print1\n";
	}
};
int main()
{
	base *b;
	sub1 s1,*s2;
	b=&s1;
	b->disp();
	s2=(sub1*)b;  // it will not check vtable information
	s2->disp();
	s2->print1();
}