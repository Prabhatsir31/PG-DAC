/*
in the following program , +operator is inherited in sub,but =operator is not inherited. In sub class, compiler implicitly provides =operator, which will invoke parent class =operator.
*/

#include<iostream>
using namespace std;

class base
{
public:
	void operator+(base &ref)
	{
		cout<<"\n base operator+\n";
	}
	void operator=(base &ref)
	{
		cout<<"\n in base operator=\n";
	}
};
class sub:public base
{
};
int main()
{
	base b1,b2;
	b1+b2;
	b1=b2;
	sub s1,s2;
	s1+s2;
	s1=s2;
}