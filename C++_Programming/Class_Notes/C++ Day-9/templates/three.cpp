#include<iostream>
using namespace std;
template<class t1,class t2>
void add(t1 a,t2 b)
{
	cout<<endl<<a+b<<endl;
}
/*template<class t1,class t2>
void add(t1 a,t1 b) Error ,you must use t2		
{
	cout<<endl<<a+b<<endl;
}*/
void main()
{
	add(30,'A');
	add(30,40);
}
