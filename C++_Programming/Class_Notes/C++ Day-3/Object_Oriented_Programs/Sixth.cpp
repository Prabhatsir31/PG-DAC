/* constructor is a special member function,which does the 
job of constructing members of the class
it is special because
a) has the same name as of class
b) called automatically when the object is created
c) it has no return type

  there are three types of constructors in c++
  1) no-arg / default constructor
  2) parameterized constructor
  3) copy constructor

  When we don't define any constructor ,no-arg constructor and copy constructor are provided by the compiler. But the moment we define any constructor, compiler does not provide "default or no-arg constructor".

  */
#include<iostream>
using namespace std;
class MyClass
{
	private:
		int num;
	public:
		void setNum(int);
		int getNum();
		MyClass()
		{
			num=0;
			cout<<"\ninside def.constructor\n";
		}
};

void MyClass::setNum(int k)
		{
			this->num=k;
		}
int  MyClass::getNum()
		{
			return num;
		}
int main()
{
	MyClass m;
	m.setNum(100);
	cout<<endl<<m.getNum()<<endl;
}
