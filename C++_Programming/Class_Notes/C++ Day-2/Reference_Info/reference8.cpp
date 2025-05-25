/* x and y can be passed to const int &a and const int &b 
as well as int a and int b , hence ambiguity error */

#include<iostream>
using namespace std;
int main()
{
	void disp(int,int);
	void disp(const int &,const int &);
	int x=3,y=8;
	disp(x,y);  // error
}
void disp(const int &a,const int &b)
{
	cout<<"in reference\t"<<a<<"\t"<<b<<endl;
}
void disp(int a,int b)
{
	cout<<"in value\t"<<a<<"\t"<<b<<endl;
}