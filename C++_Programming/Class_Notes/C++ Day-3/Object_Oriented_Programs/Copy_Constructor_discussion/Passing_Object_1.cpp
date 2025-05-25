#include<iostream>
using namespace std;
class MyClass
{
	private:
		int num;
	public:
		MyClass(int num)
		{
			this->num=num;
		}
		int getNum()
		{
			return num;
		}
		~MyClass()
		{
			cout<<"in destr\t"<<num<<endl;
		}
		MyClass(MyClass &ref) 
		{
			cout<<"in copy constr"<<endl;
			num=ref.num;
		}
		void disp(MyClass temp)// MyClass temp=m1;
		{
			cout<<temp.getNum()<<endl;
		}
};
int main()
{
	MyClass m1(200);
	cout<<endl<<m1.getNum()<<endl;
	m1.disp(m1);
}