/*
for the following program, if u set command arguments as

abc xyz lmn

then output will be


D:\temp\ConsoleApplication1\Debug\ConsoleApplication1.exe
abc
xyz
lmn

It is because ur application name is always the 0th arguments of the program.

*/

#include<iostream>
using namespace std;

int main(int argc,char *argv[])
{
	if(argc<2)
	{
		cout<<"Not enough arguments"<<endl;
		return 0;
	}
	for(int i=0;i<argc;i++)
	{
		cout<<argv[i]<<endl;
	}
	return 0;
}











