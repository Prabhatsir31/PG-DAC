/* Object Slicing
if an object of a derived class is assigned to a base class object,the compiler accepts it,
but it copies only the base portion of the object.It slices off the derived portion of the 
object.

Object slicing happens because, Base copy function (assignment) and constructor does not 
know anything about Derived. So, only Base part of Derived will be copied. 
To avoid slicing problem, we should have pure virtual function.
*/

#include<iostream>
using namespace std;
class base
{
public:
	base()
	{
		cout<<"base def const"<<endl;
	}
	int i,j;
	~base()
	{
		cout<<"base destr"<<endl;
	}
};
class sub:public base
{
public:
	sub()
	{
		cout<<"in sub def const"<<endl;
	}
	int k;
	~sub()
	{
		cout<<"in sub destr"<<endl;
	}
};
int main()
{
	base b;
	b.i=10;
	b.j=20;
	cout<<endl<<b.i<<"\t"<<b.j<<endl;
	sub s;
	s.i=100;
	s.j=200;
	s.k=300;
	cout<<endl<<s.i<<"\t"<<s.j<<endl;
	cout<<endl<<b.i<<"\t"<<b.j<<endl;
	b=s;// here object slicing will take place
	cout<<endl<<"Data of b is\t"<<b.i<<"\t"<<b.j<<endl;
	cout<<endl<<"Data of s is\t"<<s.i<<"\t"<<s.j<<"\t"<<s.k<<endl;
}




/* In the above program b contains i,j whereas s contains i,j and k.
when we say   b=s
only i and j of s get copied into i and j of b. k does not get copied. 
That is object s got sliced.
*/

