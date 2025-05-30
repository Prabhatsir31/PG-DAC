// sort example
#include<iostream>
using namespace std;

template<class type>
void sort(type *p,int len)
{
	int i,j;
	type temp;
	for(i=0;i<len-1;i++)
	{
		for(j=i+1;j<len;j++)
		{
			if(p[i]>p[j])
			{
				temp=p[i];
				p[i]=p[j];
				p[j]=temp;
			}
		}
	}
}
void main()
{
	int arr1[]={5,1,3,2,4};
	float arr2[]={45.3f,12.3f,34.4f,11.56f,8.9f};
	char arr3[]={'c','a','B','b','S'};
	int i;
	cout<<endl<<"before sorting\n";
	for(i=0;i<5;i++)
	{
		cout<<endl<<arr[i]<<endl;
	}
	sort(arr1,5);
	cout<<endl<<"after sorting\n";
	for(i=0;i<5;i++)
	{
		cout<<endl<<arr[i]<<endl;
	}
}

			
