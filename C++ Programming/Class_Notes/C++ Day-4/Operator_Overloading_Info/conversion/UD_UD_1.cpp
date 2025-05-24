// User Defined to User Defined
// in dest. = operator overloaded
#include<iostream>
using namespace std;

class Paise;
class Rupee
{
private:
	int rup;
public:
	Rupee()
	{
		rup = 0;
	}
	Rupee(int k)
	{
		rup = k;
	}
	void disp()
	{
		cout << endl << "rupee is\t" << rup << endl;
	}
	void operator=(Paise&);
};
class Paise
{
private:
	int pai;
public:
	Paise()
	{
		pai = 0;
	}
	Paise(int k)
	{
		pai = k;
	}
	int getPai()
	{
		return pai;
	}
	void disp()
	{
		cout << endl << "paise  is\t" << pai << endl;
	}
};
void Rupee::operator=(Paise& k)
{
	this->rup = k.getPai() / 100;
}
int main()
{
	Rupee r(100);
	Paise p(20000);
	r.disp();
	p.disp();
	r = p;
	r.disp();
}
