#include<iostream>
using namespace std;
class MyClass
{
private:
	int num;
public:
	void setNum(int);
	int getNum();
};
void MyClass::setNum(int num)
{
	this->num = num;
}
int  MyClass::getNum()
{
	return num;
}
int main()
{
	MyClass m;  
	MyClass m1;
	m.setNum(100);
	m1.setNum(200);
	cout << endl << m.getNum() << endl;
	cout << endl << m1.getNum() << endl;
}
