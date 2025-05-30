//example with two generic data types
#include<iostream>
using namespace std;

template<class type1,class type2>
class Stack
{
	private:
		int cnt;
		type1 a;
		type2 b;
	public:
		Stack()
		{
			cnt=0;
		
		}
		void accept(type1 x,type2 y)
		{
			a=x;
			b=y;
		}
		void disp()
		{
			cout<<endl<<a<<"\t"<<b<<endl;
		}
};
void main()
{
	Stack<int,char>s2;
	s2.accept(20,'a');
	s2.disp();

	Stack<double,char>s3;
	s3.accept(20.5,'n');
	s3.disp();
}











	