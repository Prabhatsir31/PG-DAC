#include<fstream>
#include<iostream>
using namespace std;


/*
int main()
{
	ofstream out("c:\\temp\\demo.txt");
	if(!out)
	{
		cout<<endl<<"can not open\n";
		return 0;
	}
	char ch;
	while(true)
	{
		cin.get(ch);
		out.put(ch);
		if(ch=='\n')
		{
			break;
		}
	}
	out.close();
	ifstream in("c:\\temp\\demo.txt");
	int cnt=0;
	while(in.read(&ch,1))
	{
		cnt++;
	}
	cout<<endl<<"size is\t"<<cnt<<endl; 
	return 0;

}
*/

/*
int main()
{
	ofstream out("c:\\temp\\demo.txt",ios::binary);
	if(!out)
	{
		cout<<endl<<"can not open\n";
		return 0;
	}
	char ch;
	while(true)
	{
		cin.get(ch);
		out.put(ch);
		if(ch=='\n')
		{
			break;
		}
	}
	out.close();
	ifstream in("c:\\temp\\demo.txt",ios::binary);
	int cnt=0;
	while(in.read(&ch,1))
	{
		cnt++;
	}
	cout<<endl<<"size is\t"<<cnt<<endl; 
	return 0;

}
*/