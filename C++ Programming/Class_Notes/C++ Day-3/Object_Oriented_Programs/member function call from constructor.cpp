#include <iostream>
using namespace std;
class base
{
private:
	int a=20;
public:
	base(int k)
	{
		disp();
		a=k;
	}
	void disp()
	{
		cout<<"Value of a is\t"<<a<<endl;
	}
};
int main()
{
	base b1(10);
	b1.disp();
}