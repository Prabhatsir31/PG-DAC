/*
for the following program, if u set command arguments as

100 200 300 500

then output will be


1100

*/

#include<iostream>
using namespace std;

int main(int argc,char *argv[])
{
	int sum=0;
	if(argc<2)
	{
		cout<<"Not enough arguments"<<endl;
		return 0;
	}
	for(int i=1;i<argc;i++)
	{
		sum+=atoi(argv[i]);
	}
	cout<<"Total of numbers passed is\t"<<sum<<endl;
	return 0;
}


