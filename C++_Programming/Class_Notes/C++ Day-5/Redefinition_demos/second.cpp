#include<iostream>
using namespace std;
class base
{
public:
	void disp()
	{
		cout << "base disp" << endl;
	}
};
class sub :public base
{
public:
	void disp() // redefinition
	{
		cout << "sub disp" << endl;
	}
};
int main()
{
	sub s;
	s.disp(); // sub disp
	s.base::disp();  // base disp
}