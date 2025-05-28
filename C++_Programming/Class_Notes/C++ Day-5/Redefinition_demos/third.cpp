#include<iostream>
using namespace std;
class base
{
public:
	void disp()
	{
		cout<<"base disp"<<endl;
	}
};
class sub:public base
{
public:
	/*void disp(int k) // what if we give diff arg
	{
		cout<<"sub disp"<<endl;
	}*/
};
int main()
{
	sub s;
//	s.disp(); // Error
	s.base::disp();  // base disp
}