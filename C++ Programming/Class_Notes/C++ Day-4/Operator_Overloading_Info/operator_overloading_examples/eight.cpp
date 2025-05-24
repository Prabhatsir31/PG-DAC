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
	MyClass operator+(int x) 
	{
		return MyClass(this->num+x);
	}
//	friend MyClass operator+(MyClass &,int);
};
/*MyClass operator+(MyClass &m,int x)
{
	return MyClass(m.num+x);
}*/

int main()
{
	MyClass m1(20);
	MyClass m2;
	m2=m1+20;
	m2.disp();
}