/* In the following code, since the parent class method is virtual, while invoking method through a pointer, content of the pointer is considered. This happens during runtime. Hence it is called as "Late binding" or "Dynamic Polymorphism" or "Runtime Polymorphism".

Note:- In C++ Late binding or Runtime Polymorphism can be achieved using

	a) virtual functions
	b) parent class pointer or reference

*/

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
	base *ptr=new base;
	ptr->disp();  // content will be considered
	ptr=new sub;    // upcasting
	ptr->disp();  // content will be considered
	return 0;
}