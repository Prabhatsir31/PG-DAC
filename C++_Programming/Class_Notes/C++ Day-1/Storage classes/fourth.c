// static variables persists their values for diff.fun. 
//invocation. It is used at the place where value needs to be 
//persistent between diff. fun.calls
// Storage- Memory
// Def.Initial value- Zero
// Scope- Ltd.to the block in which it is defined
// Lifetime- value persists between diff.fun. calls
#include<stdio.h>
void main()
{
	void disp();
	int i;
	for(i=0;i<3;i++)
	{
		disp();
	}
}
void disp()
{
	int a=0;
	static int b; //0 by default, executes only once
	printf("%d\t%d\n",a++,b++);
}
