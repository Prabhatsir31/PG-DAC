#include<fstream>
#include<iostream>
using namespace std;
class MyClass
{
private:
	int num;
public:
	MyClass(int k)
	{
		num=k;
	}
friend ostream& operator<<(ostream &,MyClass &);
friend MyClass operator+(int,MyClass&);
MyClass operator+(int k)
{
	return MyClass(num+k);
}

MyClass operator+(MyClass &ref)
{
	return MyClass(num+ref.num);
}	
};
MyClass operator+(int k,MyClass &ref)
{
	return MyClass(k+ref.num);
}
ostream& operator<<(ostream &o,MyClass &ref)
{
	o<<ref.num<<endl;
	return o;
}

template <class type1,class type2>
void add(type1 a,type2 b)
{
	cout<<endl<<a+b<<endl;
}
void main()
{
	add(20,7.8);
	add('A',4.5);
	add(34.30,12);
	add(20,30);
	MyClass m1(20);
	add(m1,50);
	add(40,m1);
	add(m1,m1);
}




