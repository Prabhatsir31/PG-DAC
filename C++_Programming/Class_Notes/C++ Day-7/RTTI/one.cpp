#include<iostream>
using namespace std;
class myclass1 {};
class myclass2 {};
int main()
{
	int i, j;
	float f;
	char* p;
	int* ptr;
	myclass1 m1;
	myclass2 m2;
	cout << endl << typeid(i).name() << endl;
	cout << endl << typeid(j).name() << endl;
	cout << endl << typeid(f).name() << endl;
	cout << endl << typeid(p).name() << endl;
	cout << endl << typeid(m1).name() << endl;
	cout << endl << typeid(m2).name() << endl;
	cout << endl << typeid(ptr).name() << endl;
	if (typeid(i) == typeid(m1))
	{
		cout << endl << "they are equal\n";
	}
	else
	{
		cout << endl << "they are not equal\n";
	}
	cout << "size of pointer p is\t" << sizeof(p) << endl;
}