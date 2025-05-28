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
	virtual void print1()
	{
		cout<<endl<<"in print1\n";
	}
};
void main()
{
	base *b;
	sub1 s1,*s2;
	//b=&s1;
	b=new base;
	b->disp();
	s2=dynamic_cast<sub1*>(b); // downcasting with dynamic_cast
	if(s2)  // if  successful s2 will contain the contents of b else NULL
	{
		s2->disp();	
		s2->print1();
	}
	else
	{
		cout<<"failed"<<endl;
	}
}
