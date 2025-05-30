#include<iostream>
#include<vector>
using namespace std;
class base
{
public:
	void disp()
	{
		cout<<"in base disp"<<endl;
	}
};
class sub:public base
{
	public:
	void disp()
	{
		cout<<"in sub disp"<<endl;
	}
};
class sub1:public base
{
	public:
	void disp()
	{
		cout<<"in sub1 disp"<<endl;
	}
};
int main()
{
	vector<base> v;  // store base and its children
	base b;
	sub s;
	sub1 s1;
	v.push_back(b);
	v.push_back(s);
	v.push_back(s1);
	vector<base>::iterator itr=v.begin();
	for(; itr!=v.end();itr++)
	{
		(*itr).disp();
		//itr->disp();
	}
	return 0;
}