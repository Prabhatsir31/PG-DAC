#include<iostream>
using namespace std;
class base
{
private:
	int num1=10;
public:
	void disp1()
	{
		cout << num1 << endl;
	}
};
class sub :base
{
private:
	int num2=20;
public:
	void disp2()
	{
		cout << num2 << endl;
	}
};

int main()
{
	sub s;
	s.disp2();
	// s.disp1(); // error
	return 0;
}