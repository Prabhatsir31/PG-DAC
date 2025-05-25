#include<iostream>
using namespace std;
class MyClass
{
private:
	int num;
public:
	MyClass(int k)
	{
		num = k;
	}
	MyClass()
	{
		num = 0;
	}
	void disp()
	{
		cout << endl << num << endl;
	}
	void operator+=(MyClass& k)
	{
		this->num = this->num + k.num;
	}
};
int main()
{
	MyClass m1(25);
	MyClass m2(35);
	m1.disp();
	m2.disp();
	MyClass m3;
	//m3+=m1;
	m3.operator+=(m1);
	m3.disp();
}