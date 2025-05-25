#include<iostream>
using namespace std;
int main()
{
	int arr[3]={10,20,30};
	int (&ref)[3]=arr; //reference to an array
	void disp();
	void (&ref1)()=disp; //reference to a function
	for(int i=0;i<3;i++)
	{
		cout<<endl<<ref[i]<<endl;
	}
	ref1();
	// ref++;	//can not increment bec. ref gets automatically 
				//dereferenced
}
void disp()
{
	cout<<"in disp\n";
}