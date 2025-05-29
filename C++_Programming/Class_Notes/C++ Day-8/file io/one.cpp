#include<fstream>
#include<iostream>
using namespace std;
int main()
{
	char str[30];
	ofstream out("c:\\temp\\one.txt");
	if (!out)
	{
		cout << endl << "can not open\n";
		return 0;
	}
	out << "helloworld";
	out.close();
	ifstream in("c:\\temp\\one.txt");
	if (!in)
	{
		cout << endl << "can not open\n";
		return 0;
	}
	in >> str;
	in.close();
	cout << endl << str << endl;
	return 0;
}
