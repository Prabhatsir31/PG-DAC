/*The default scope of a variable can be changed by defining
 the variable out side  a function,where normally function is
 defined .
 Such variable is called as "external variable" ,and it 
 can be accessible to all those functions,which are defined
 after its definition.*/
#include<stdio.h>
void main()
{
	void disp();
	void disp1();
	disp();
	disp1();
}
int num=20; //external variable definition
void disp()
{
	 printf("In disp\t%d\n",num);
}
void disp1()
{
	 printf("In disp1\t%d\n",num);
}
