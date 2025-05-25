#include<iostream>
using namespace std;
int main()
{
	int num=20;
	const int &ref=num;
	cout<<endl<<ref;
	// ref++; Error
	num++;
	cout<<endl<<ref;

	const int num1=30;
//	int &ref1=num1; Error
	const int &ref1=num1;

	int a=50,*ptr=&a;
	cout<<endl<<*ptr;
	int* &ref3=ptr;  //Reference to a Pointer
	cout<<endl<<*ref3<<endl;

	ptr++;
	cout<<endl<<ptr<<endl;
	cout<<endl<<ref3<<endl;
}