/* in this program copy constrctor of sub 
(provided by compiler) calls copy constructor
of base class i.e. parent class.
*/

#include<iostream>
using namespace std;
class base
{
	int a;
public:
	base()
	{
		cout << "in base def const" << endl;
		a = 0;
	}
	base(int k)
	{
		cout << "in base param const" << endl;
		a = k;
	}
	void disp1()
	{
		cout << a << endl;
	}
	base(base& ref)
	{
		cout << "in base copy" << endl;
		a = ref.a;
	}
	~base()
	{
		cout << "in base dest" << endl;
	}
};
class sub :public base
{
	int b;
public:
	sub(int k) :base(4)
	{
		cout << "in sub param const" << endl;
		b = k;
	}
	void disp2()
	{
		cout << b << endl;
	}
	~sub()
	{
		cout << "in sub dest" << endl;
	}
};
int main()
{
	sub s1(10);
	s1.disp1();
	s1.disp2();

	sub s2 = s1;
	s2.disp1();
	s2.disp2();
}