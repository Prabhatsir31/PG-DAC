#include<iostream>
#include<set>
using namespace std;
// set allows a program to store a group of values 
// in sorted order
int main()
{
	set<int> charvect;
	set<int>::iterator myiter;
	for(int i=10;i>0;i--)
	{
		charvect.insert(i);
	}
	charvect.insert(10); //no duplicates
	for(myiter=charvect.begin();myiter!=charvect.end();myiter++)
	{
		cout<<endl<<*myiter<<endl;
	}
}