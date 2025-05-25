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
	MyClass operator+(MyClass& k)
	{
		return MyClass(this->num + k.num);
	}
	~MyClass()
	{
		cout << "inside destructor\t" << num << endl;
	}

};
int main()
{
	MyClass m1(25);
	MyClass m2(35);
	m1.disp();
	m2.disp();
	MyClass m3;
	m3 = m1 + m2;
	//m3=m1.operator+(m2);
	cout << "addition done" << endl;
	m3.disp();
}