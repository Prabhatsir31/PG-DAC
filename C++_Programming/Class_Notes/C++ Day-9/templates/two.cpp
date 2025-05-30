//function with 2 generic types
#include<iostream>
using namespace std;
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
}