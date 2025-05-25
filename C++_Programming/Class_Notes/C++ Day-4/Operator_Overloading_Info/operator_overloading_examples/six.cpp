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
	MyClass operator++() // for prefix operator
	{
		this->num++;
		return *this;
	}
	//friend MyClass operator++(MyClass &);
};
/*MyClass operator++(MyClass &m)
{
	m.num++;
	return m;
}*/

int main()
{
	MyClass m1(20);
	MyClass m2;
	m2=++m1;
	m2.disp();
	m1.disp();
}