#include<iostream>
using namespace std;
class MyClass
{
public:
	MyClass()
	{
		cout<<endl<<"in def const\n";
	}
	~MyClass()
	{
		cout<<endl<<"in MyClass dest\n";
	}
};
int sqr(int k)
{
	if(k<0)
	{
		char message[] = "negative value is not allowed";
		throw message; //throwing an exception to the caller
	}
	else if(k==0)
	{
		throw k;
	}
	else if(k%2!=0)
	{
		throw MyClass();
	}
	else
	{
		return k*k;
	}
}
int main()
{
	int num,res=0;
	cout<<endl<<"enter a number to calculate square\n";
	cin>>num;
	try
	{
		res=sqr(num);
	}
	catch(char *ptr)
	{
		cout<<endl<<"Error is\t"<<ptr<<endl;
	}
	catch(int p)
	{
		cout<<endl<<"Error is\t"<<p<<endl;
	}
	catch(MyClass &m) // in order to catch remaining types
	{
		cout<<endl<<"Error is neither 0 nor negative\n";
	}
	cout<<endl<<"Result is \t"<<res<<endl;
}