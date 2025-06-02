// with reference
#include<iostream>
using namespace std;
class base
{
public:
	virtual void disp(){}
};
class sub:public base
{
};
int main()
{
	
	sub sb;
	base &bb=sb;
	base b;
	//base &bb=b;
	sub ob;
	ob=dynamic_cast<sub&>(bb);
	cout<<"To be continued....."<<endl;
}
