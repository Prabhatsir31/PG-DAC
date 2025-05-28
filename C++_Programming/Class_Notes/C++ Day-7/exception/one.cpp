#include<iostream>
using namespace std;
int sqr(int k)
{
	if(k<=0)
	{
		throw "only positive value is allowed"; //throwing an exception to the caller
	}
	else
	{
		return k*k;
	}
}
int main()
{
	int num;
	cout<<endl<<"enter a number to calculate square\n";
	cin>>num;
	int res=sqr(num);
	cout<<endl<<"Result is \t"<<res<<endl;
}