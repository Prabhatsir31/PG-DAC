

#include<iostream>
using namespace std;
int main()
{
	int num=30;
	int num1=40;
//	int &rr; //reference must be initialized
	int &ref=num;  //reference must be initialized
	int &ref1=ref; //ref1 is actually refers to the num
	cout<<num<<endl;
	cout<<ref<<endl; //reference gets automatically dereferenced
	ref=0;
	cout<<num<<endl;
	cout<<ref1<<endl;
	int a=20,b=30,c=40;
//	int &ref2[3]={a,b,c}; // array of reference is not allowed
//	cout<<ref2[0]<<endl<<ref2[1]<<endl<<ref2[2]<<endl;
}
