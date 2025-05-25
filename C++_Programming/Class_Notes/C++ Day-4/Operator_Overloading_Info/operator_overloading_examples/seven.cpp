#include<iostream>
using namespace std;

class MyClass
{
private:
	int num;
public:
	MyClass()
	{
		num=0;
	}
	MyClass(int k)
	{
		num=k;
	}
	void disp()
	{
		cout<<endl<<num<<endl;
	}
	MyClass operator++(int x) // for postfix operator
	{
		return MyClass(this->num++);
	}
//	friend MyClass operator++(MyClass &,int);
};
/*MyClass operator++(MyClass &m,int x)
{
	return MyClass(m.num++);
}*/

int main()
{
	MyClass m1(20);
	MyClass m2;
	m2=m1++;
	m2.disp();
	m1.disp();
}