/*
cin and cout are objects of istream and ostream classes respectively.
no "&" and "format specifiers" required.
cin needs >> (extraction operator)
cout needs << (insertion operator)

scanf and printf are variable number of arguments functions.
*/

#include<iostream>
using namespace std;
int main()
{
	char name[20];
	int age;
	cout<<"Enter name and age"<<endl;
	cin>>name>>age;
	cout<<name<<"\t"<<age<<endl;
}
















