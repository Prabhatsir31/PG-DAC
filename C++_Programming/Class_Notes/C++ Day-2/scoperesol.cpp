// :: Scope Resolution Operator
#include<iostream>
using namespace std;
int val=100;
int main()
{
	int val=20;
	cout<<endl<<val<<endl;
	cout<<endl<<::val<<endl;
}
