#include<fstream>
#include<iostream>
using namespace std;
int main()
{
	char str[80];
	ofstream of("c:\\temp\\two.txt");
	cout << endl << "enter lines,press enter to stop\n";
	do
	{
		cin.getline(str, 80);
		if (strlen(str) == 0)
		{
			break;
		}
		of << str<<endl;
	} while (true);
	of.close();
	ifstream iff("c:\\temp\\two.txt");
	char ptr[80];
	while (iff.getline(ptr, 80))
	{
		cout <<ptr << endl;
	}
	iff.close();
	return 0;
}
