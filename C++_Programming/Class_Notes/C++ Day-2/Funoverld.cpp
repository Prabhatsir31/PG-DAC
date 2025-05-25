/* C++ compiler changes name of all the function definitions , declarations and calls while compiling the program. This is known as "name mangling" or "name decoration".

That is Name mangling means different names are given to the different versions of an overloaded function.

Name mangling is compiler dependent.Different compiler may mangle the same function name differently.Compiler mangles the name as per the type,order and number of arguments.

Name mangling is also known as "name decoration".
*/

#include<iostream>
using namespace std;
void open(char *accno)
{
	cout<<"Account Opened\t"<<accno<<endl;
}
void open(char *accno,double balance)
{
	cout<<"Account Opened\t"<<accno<<"\t"<<balance<<endl;
}
int main()
{
	open("A100");
	open("A101",10000);
	return 0;
}











