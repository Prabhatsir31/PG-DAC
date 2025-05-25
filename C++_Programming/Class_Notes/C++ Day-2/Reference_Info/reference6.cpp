/* 10 and 20 can not be passed to int &a and int &b because they are constant */

#include<iostream>
using namespace std;
int main()
{
	void disp(int,int);
	void disp(int &,int &);
	disp(10,20); // in value 
}
void disp(int &a,int &b)
{
	cout<<"in reference\t"<<a<<"\t"<<b<<endl;
}
void disp(int a,int b)
{
	cout<<"in value\t"<<a<<"\t"<<b<<endl;
}