/* A derived class destructor calls its base class destructor
after the derived class destructor does everything else.
If the base class needs no custom destruction,you still must
provide a virtual destructor (with an empty block)to permit the
proper destructor calls for dynamically allocated objects. */

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
	virtual ~base()
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
	delete b; //it will invoke sub destructor and then of base
}