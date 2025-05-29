// setw is for displaying data in a tabular form
#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
	double per[] = { 34.56,78.67,55.67,86.34 };
	char names[4][20] = { "aaa","bbb","ccc","ddd" };
	cout.precision(3);
	cout.setf(ios::fixed);
	for (int i = 0; i < 4; i++)
	{
		cout << setw(3) << names[i] << setw(20) << per[i] << endl;
	}
}