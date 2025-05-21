#include<iostream>
using namespace std;

int main()
{
	#ifndef SIZE
	#define SIZE 5
	#endif
	int i;
	int arr[SIZE]={10,20,30,40,50};
	for(i=0;i<SIZE;i++)
	{
		cout<<arr[i]<<endl;
	}
	return 0;
}
