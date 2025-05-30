#include<iostream>
using namespace std;
template<class type>
class myclass
{
	public:
		myclass()
		{
			cout<<"in myclass def const"<<endl;
		}
		void disp1(type a)
		{
			cout<<a<<endl;
		}
};
template<class type,class type1>
class sub:public myclass<type>
{
public:
	sub()
	{
		cout<<"in sub def const"<<endl;
	}
	void disp2(type1 a)
	{
		cout<<"in disp2"<<a<<endl;
	}
};
void main()
{
	sub<int,char> s;
	s.disp1(20);
	s.disp2('A');

	sub<double,int> s1;
	s1.disp1(4.5);
	s1.disp2(50);
}



















