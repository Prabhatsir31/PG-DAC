#include<iostream>
using namespace std;
/*
static_cast

performs a non-polymorphic cast.it can be used for any standard
conversion. no routine checks are performed.

  static_cast<type>(expr)

  type specifies target type of the cast and expr is the expr.
  being cast into a new type.

*/

class base
{
};
class sub1 :public base
{
};
class myclass
{
};
int main()
{
	int i;
	double d = 4.5;
	i = static_cast<int>(d); // they are compatible
	cout << i << endl;


	base* b = new base;
	myclass* m = (myclass*)b; // possible at compile
	//time, even if myclass and base are not 
	//compatible
	//myclass *m=static_cast<myclass *>(b); // not
	// possible at compile time, hence it is safe

}
