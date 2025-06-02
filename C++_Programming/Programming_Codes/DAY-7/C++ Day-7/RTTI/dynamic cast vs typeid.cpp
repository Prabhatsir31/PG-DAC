/* Difference between typeid and dynamic_cast

typeid does not check complete inheritance hierarchy  i.e it does not use virtual table. Hence if u are using typeid , it is not compulsory to use polymorphic type.

dynamic_cast can check complete inheritance hierarchy i.e it uses virtual table for this purpose. Hence if u are using dynamic_cast ,  you must have polymorphic type.

*/

#include<iostream>
using namespace std;
class base
{
public:
	virtual void disp(){}
};
class sub:public base
{
	public:
	void disp()
	{
		cout<<endl<<"in disp of sub\n";
	}
};
class sub1:public sub
{
public:
	void disp()
	{
		cout<<endl<<"in disp of sub1\n";
	}
};
int main()
{
	base *b=new sub1;
	sub *s1;
	sub1 *s2;
	/*s1=dynamic_cast<sub*>(b);
	if(s1)
	{
		s1->disp();
	}
	else
		cout<<"not successful\n";*/

	if(typeid(*b)==typeid(sub))
		cout<<"equal\n";
	else
		cout<<"not equal\n";

}