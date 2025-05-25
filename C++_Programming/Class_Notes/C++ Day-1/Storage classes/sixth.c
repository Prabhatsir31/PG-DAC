//External var. declaration is required when you are using it,
//before its definition.
// Memory is allocated when External var. is defined and not when it
// is declared.
#include<stdio.h>
void main()
{
	int num1=20;
	extern num2; //external var. declaration
	void disp();
	printf("%d\n",num1);
	printf("%d\n",num2);
	disp();
}
int num2=40; // external var. definition
void disp()
{
	printf("%d\n",num2);
}