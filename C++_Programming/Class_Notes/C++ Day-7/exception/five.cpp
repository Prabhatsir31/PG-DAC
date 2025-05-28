#include<iostream>
using namespace std;

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
		throw 34.78;
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
	/*catch(...) // Error
	{
		cout<<endl<<"Error is not divisible by 2\n";
	}*/
	catch(char *ptr)
	{
		cout<<endl<<"Error is\t"<<ptr<<endl;
	}
	catch(int p)
	{
		cout<<endl<<"Error is\t"<<p<<endl;
	}
	catch(...) // in order to catch remaining types
	{
		cout<<endl<<"Error is not divisible by 2\n";
	}
	cout<<endl<<"Result is \t"<<res<<endl;
}