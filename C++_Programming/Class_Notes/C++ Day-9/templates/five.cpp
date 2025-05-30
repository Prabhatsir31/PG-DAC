#include<iostream>
using namespace std;

// Template function to add two values of any type

template<class T>
void add(T a,T b)
{
	cout<<endl<<a+b<<endl;
}

// Overloaded template function to concatenate two ints

void add(int a,int b)
{
	cout<<endl<<"in overloaded add fun.\n";
	if(a!=b)
	{
		cout<<a+b;
	}
	else
	{
		cout<<"\ncannot perform add,both are same\n";
	}
}
int main()
{
	add(4,5);  // compiler will use "add(int,int)" function
	add(45.89,32.60);
	add('a','b');
}