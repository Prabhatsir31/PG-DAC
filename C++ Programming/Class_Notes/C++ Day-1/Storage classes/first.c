//Scope of a variable
//By def. scope of a variable is ltd. to a block or a function
//in which it is defined.
#include<stdio.h>
void main()
{
	void disp();
	int num1=9;
	disp();
	printf("%d\n",num1);
}
void disp()
{
	// printf("%d\n",num1); Error
	puts("in side disp function");
}