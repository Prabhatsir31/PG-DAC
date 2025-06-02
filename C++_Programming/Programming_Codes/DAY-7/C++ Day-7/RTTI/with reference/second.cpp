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
//	base &bb=sb;
	base b;
	base &bb=b;
	sub ob;
	try
	{
	ob=dynamic_cast<sub&>(bb);
	}
	catch(bad_cast &ref)
	{
		cout<<"\nin catch block\t"<<ref.what()<<endl;
	}
	cout<<"To be continued....."<<endl;
}




