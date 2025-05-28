#include<iostream>
using namespace std;
class base
{
public:
	void disp()
	{
		cout<<"base disp with arg"<<endl;
	}
};
class sub:public base
{
public:
	void disp() // what if we give diff arg
	{
		cout<<"sub disp w/o arg"<<endl;
		base::disp(); // invoke base disp
	}
};
int main()
{
	sub s;
	s.disp(); // sub disp

	s.base::disp(); // base disp
}