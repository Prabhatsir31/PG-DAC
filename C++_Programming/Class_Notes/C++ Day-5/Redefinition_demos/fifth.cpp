#include<iostream>
using namespace std;
class base
{
public:
	void disp(int k)
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
	}
};
int main()
{
	sub s;
	s.disp(); // sub disp
//	s.disp(10); // error
	s.base::disp(10); // base disp
}