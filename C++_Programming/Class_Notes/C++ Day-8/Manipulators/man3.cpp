// fill is to fill a particular character.
#include<iostream>
using namespace std;
int main()
{
	double per[] = { 1.23,35.67,744.56,3452.789 };
	for (int i = 0; i < 4; i++)
	{
		cout.width(10);
		cout.fill('*');
		cout << per[i] << endl;
	}
}