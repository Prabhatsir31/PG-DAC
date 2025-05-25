// Function returning reference
// function call can be on the left side
#include<iostream>
using namespace std;
int num=200;
int main()
{
	int& disp();
	cout<<"before call\t"<<num<<endl;
	disp()=400;
	cout<<"after call\t"<<num<<endl;
}
int& disp()
{
	return num;  // return the reference of num
}
