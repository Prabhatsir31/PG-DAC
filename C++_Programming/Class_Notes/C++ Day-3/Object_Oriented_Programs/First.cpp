#include<iostream>
using namespace std;
class MyClass
{
private:
	int num=10; // instance member
public:
	void setNum(int k)  // member function  // inline
	{
		num = k;
	}
	int getNum()     // member function
	{
		return num;
	}
};
int main()
{
	MyClass m;  // object of MyClass
	//m.setNum(100);
	cout << endl << m.getNum() << endl;
}