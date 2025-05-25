#include<iostream>
using namespace std;
class MyClass
{
private:
	const int cnt=9; // no need to initialize in the constructors
	//const int cnt;  // you must initialize in the constructor
	int num=5;
public:
	MyClass(int k) // no need to initialize "cnt" here as it has been initialized above
	{
		num = k;
	}
	/*
	if you haven't initialize "cnt" above
	MyClass(int a, int b) :cnt(b)
	{
		num = a;
	}
	*/

	void disp()
	{
		//cnt++; //Error
		num++;  // No Error
		cout << endl << num << "\t" << cnt << endl;
	}
	void myfun()const
	{
		//cnt++; //Error
		//num++; //Error
		cout << endl << num << "\t" << cnt << endl;
	}

};
int main()
{
	MyClass m(100);
	m.disp();
	m.myfun();
}