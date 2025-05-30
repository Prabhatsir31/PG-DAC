#include<iostream>
#include<map>
using namespace std;
int main()
{
	map<char,int> m;
	int i=0;
	for(i=0;i<26;i++)
	{
		m.insert(pair<char,int>('A'+i,65+i));
	}
	char ch;
	cout<<endl<<"Enter a key\n";
	cin>>ch;
	map<char,int>::iterator p;
	p=m.find(ch);
	if(p!=m.end())
	{
		cout<<endl<<p->second<<endl; // searched value can be accessed using second
	}
	else
	{
		cout<<endl<<"key not in map\n";
	}
}