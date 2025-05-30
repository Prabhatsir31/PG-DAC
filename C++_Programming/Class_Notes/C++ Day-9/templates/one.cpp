#include<iostream>
using namespace std;
template <class type>
void add(type a,type b) //Function Template
{
	cout<<endl<<a+b<<endl;
}
// "type" is known as a template argument
void main()
{
	add(20,40);
	add('A','b');
	add(34.30,45.89);
}
/* The compiler can not generate any code by just looking at function template,because it does not know which data type ,the function is going to work on.
In the above program when compiler encounter the function call,
i.e. add(20,40) ,it knows the type to use is int,because we pass two integers. Now it generates a specific version on the add() for type int,replacing every "type" with an int.This process is known as instantiating the function template.The compiler also generates a call to the newly instantiated function,and inserts it into the code where add(20,40) is.
Similarly, the expression add('A','B') causes the compiler to generate a version of add() that operates on type char and a call to this function and add(34.30,45.89) call generates a function that works on type double.
More Importantly,The compiler generates only one version of add() for each data type irrespective of the number of calls that have been made for that type.

Do templates help us save memory ?
Not really, because even when we use templates the four functions (for int,char and double) do get generated.
The advantage is we are not required to type them out.The compiler
creates them from the generic version that we pass on to it.
This makes the program shorter and easier to understand.
Another advantage is ,if we are to modify the function we need to make the changes at only one place in the program instead of three places.
*/





