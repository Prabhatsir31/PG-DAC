#include<iostream>
using namespace std;

#define SIZE 5

int main()
{
	#ifdef SIZE
	cout<<"SIZE is defined"<<endl;
	cout<<"hello"<<endl;
	#else
	cout<<"SIZE is not defined"<<endl;
	cout<<"welcome"<<endl;
	#endif
	
	return 0;
}
