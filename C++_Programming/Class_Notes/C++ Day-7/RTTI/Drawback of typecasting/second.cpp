#include<iostream>
using namespace std;
class base
{
public:
	virtual void disp()
	{
		cout<<endl<<"in base disp\n";
	}
	/*virtual void print1()
	{
		cout<<"base print1"<<endl;
	}*/
	
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
//	b=&s1;
	b=new base;
	b->disp();
	s2=(sub1*)b; // it will not check vtable information
	cout<<s2<<endl;
	s2->disp();
	s2->print1(); // early binding because it is not virtual
}