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
	this->num =num;
}
int  MyClass::getNum()
{
	return num;
}
int main()
{
	MyClass *m = new MyClass;
	m->setNum(30);
	cout << endl << m->getNum() << endl;
	(*m).setNum(90);
	cout << endl << (*m).getNum() << endl;

	delete m;
}