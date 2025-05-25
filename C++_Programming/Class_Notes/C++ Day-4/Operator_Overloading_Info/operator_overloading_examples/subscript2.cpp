#include<iostream>
using namespace std;
class MyClass
{
private:
	char* name;
public:
	MyClass(const char* ptr)
	{
		name = new char[strlen(ptr) + 1];
		strcpy_s(name,sizeof(name)-1, ptr);
	}
	void disp()
	{
		cout << endl << name << endl;
	}
	char& operator[](int x)
	{
		if (x >= 0 && x <= (strlen(name) - 1))
		{
			return name[x];
		}
		else
		{
			cout << endl << "out of range\n";
			exit(0);
		}

	}
};
int main()
{
	MyClass m1("sachin");
	m1.disp();
	cout << endl << "initial of sachin is\n";
	m1[0] = 'R';
	m1.disp();
}