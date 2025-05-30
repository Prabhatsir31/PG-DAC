#include<iostream>
using namespace std;

class myclass
{
public:
	void disp1()
	{
		cout<<endl<<"in disp1\n";
	}
	template<class type>
	void disp2(type a)
	{
		cout<<"\n in template fun\t"<<a<<endl;
	}
};
void main()
{
	myclass m;
	m.disp1();
	int num=50;
	m.disp2(num);
	char ch='A';
	m.disp2(ch);
}






