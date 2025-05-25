// Call by Reference example using Reference
#include<iostream>
using namespace std;
int main()
{
	void swap(int &,int &);
	int num1,num2;
	cout<<endl<<"Enter two nos\n";
	cin>>num1>>num2;
	cout<<"\nBefore call\t"<<num1<<"\t"<<num2<<endl;
	swap(num1,num2);
	cout<<"\nAfter call\t"<<num1<<"\t"<<num2<<endl;
}
void swap(int &a,int &b) //Saving memory here
{
	int c=a;
	a=b;
	b=c;
}