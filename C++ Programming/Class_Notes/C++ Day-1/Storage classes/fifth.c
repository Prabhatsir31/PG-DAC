// register storage class might store a variable inside 
// CPU Register,which allows speedy access to that variable
// However there is no guarantee that a variable,can be stored
// in a CPU Register. If No Register is available,then a variable
// is simply treated as automatic variable.
// Hence register keyword is mere request and not a command
// Usually variables which are accessed often during program 
// execution e.g. inside loops ,are stored as register.

// Storage- CPU Register
// Def.Initial value- Garbage
// Scope- Ltd.to the block in which it is defined
// Lifetime- Till the control remains in the block.
#include<stdio.h>
void main()
{
	register int i;
	for(i=0;i<4;i++)
	{
		printf("%d\n",i);
	}
}