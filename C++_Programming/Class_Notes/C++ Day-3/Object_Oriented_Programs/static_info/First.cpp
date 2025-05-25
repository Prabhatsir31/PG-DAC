#include<iostream>
using namespace std;
class MyClass
{
private:
	static int cnt;
	int num;
public:
	
	MyClass(int k)
	{
		num=k;
		
	}
	void disp()
	{
		cout<<endl<<"in side disp\t"<<num<<endl;
		//cout<<cnt<<endl;
	}
	
	static void show()
	{
		cout<<cnt<<endl;
	}
};
int MyClass::cnt=30;
int main()
{
	MyClass m1(100);
	MyClass m2(200);
	MyClass::show();
}