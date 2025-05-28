#include<iostream>
using namespace std;

class base1
{
public:
	void disp()
	{
		cout<<"base1 disp"<<endl;
	}
};
class base2
{
public:
	void disp()
	{
		cout<<"base2 disp"<<endl;
	}
};
class sub:base1,base2
{
public:
	void fun()
	{
		base1::disp();
		base2::disp();
		cout<<"fun"<<endl;
	}
};
int main()
{
	sub s;
	s.fun();
	return 0;
}