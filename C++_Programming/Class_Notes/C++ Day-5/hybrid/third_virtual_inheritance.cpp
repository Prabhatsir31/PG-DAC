/* When two or more objects(parent1 and parent2) are derived from  a common base class (Grandparent) ,you can prevent multiple copies of the base class(Grandparent) from being present in an object (child)  derived from those objects(parent1 and parent2) by declaring the base class(Grandparent) as virtual,when it is inherited */
#include<iostream>
using namespace std;
class Gp
{
private:
	int num1;
public:
	Gp()
	{
		cout<<"Gp no-arg constr"<<endl;
	}
	void disp1()
	{
		cout<<"Gp disp1"<<endl;
	}
	~Gp()
	{
		cout<<"Gp dest"<<endl;
	}
	
};
class P1:public virtual Gp
{
private:
	int num2;
public:
	P1()
	{
		cout<<"P1 no-arg const"<<endl;
	}
	~P1()
	{
		cout<<"P1 dest"<<endl;
	}
};
class P2:virtual public Gp
{
private:
	int num3;
public:
	P2()
	{
		cout<<"P2 no-arg const"<<endl;
	}
	~P2()
	{
		cout<<"P2 dest"<<endl;
	}
};
class child:public P1,public P2
{
private:
	int num4;
public:
	child()
	{
		cout<<"child no-arg const"<<endl;
	}
	~child()
	{
		cout<<"child dest"<<endl;
	}
};
int main()
{
	child c;
	
	c.disp1();
	
	
}