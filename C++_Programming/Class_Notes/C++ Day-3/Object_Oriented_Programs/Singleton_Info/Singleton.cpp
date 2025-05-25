#include<iostream>
using namespace std;

class single
{
private:

static single s;
	single(single &ref)
	{
		cout<<"in copy const\n";
	}
	single()
	{
		cout<<"in def const\n";
	}
public:
	void disp()
	{
		cout<<"in disp method\n";
	}
	static single& getSingle()
	{
		
		return s;
	}
};
single single::s;
int main()
{
	single &ref=single::getSingle();
	ref.disp();
}