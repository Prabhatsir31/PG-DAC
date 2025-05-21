//Storage classes
//There are 4 types of storage classes.
// a)automatic b)static c)register d)extern
// Storage class decides following things
// 1)storage 2)Def. Initial Value 3)Scope 4)Lifetime
// By Def. any variable is decl. inside a function or a block
// is automatic
// Storage- Memory
// Def.Initial value- garbage
// Scope- Ltd.to the block in which it is defined
// Lifetime- Till control remains in that block
#include<stdio.h>
void main()
{
	void disp();
	auto int num;
	//int num;
	printf("%d\n",num);
	disp();
}
void disp()
{
//	 printf("%d\n",num); Error
}