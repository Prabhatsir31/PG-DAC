#include<iostream>
using namespace std;
class base
{
public:
	virtual void disp()
	{
		cout<<endl<<"in disp\n";
	}
	base()
	{
		cout<<endl<<"in base def.const\n";
	}
	~base()
	{
		cout<<endl<<"in base dest\n";
	}
};
class sub:public base
{
public:
	sub()
	{
		cout<<endl<<"in sub def.const\n";
	}
	~sub()
	{
		cout<<endl<<"in sub dest\n";
	}
	void disp()
	{
		cout<<endl<<"in disp of sub\n";
	}
};
int main()
{
	base *b=new sub;
	b->disp();
	delete b; //it will invoke only destructor of base
}
