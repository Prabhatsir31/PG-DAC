#include<iostream>
using namespace std;
int sqr(int k)
{
	if(k<=0)
	{
		char message[] = "only positive value is allowed";
		throw message; //throwing an exception to the caller
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
		cout<<endl<<"function is called\n";// will not execute
	}
//	cout<<endl<<"hello\n"; Error
	catch(char *ptr)
	{
		cout<<endl<<"Error is\t"<<ptr<<endl;
	}
	cout<<endl<<"Result is \t"<<res<<endl;
}