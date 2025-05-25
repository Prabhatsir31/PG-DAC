#include<iostream>
using namespace std;
class MyClass
{
	private:
		const int cnt;
		int num;
	public:
		MyClass(int k,int m):cnt(m)
		{
			num=k;
		}
		MyClass():cnt(102)
		{
			num=22;
		}
		void disp() //can not be called by const object
		{
			//cnt++; //Error
			num++;  // No Error
			cout<<endl<<num<<"\t"<<cnt<<endl;
		}
		void myfun()const //can be called by const as well as non-const objects
		{
			//cnt++; //Error
			//num++; //Error
			cout<<endl<<num<<"\t"<<cnt<<endl;
		}

};
int main()
{
	MyClass m(100,10);
	m.disp();
	m.myfun();
	const MyClass m1;
//	m1.disp(); Can not call non-const member fun. using const object
	m1.myfun();
}



