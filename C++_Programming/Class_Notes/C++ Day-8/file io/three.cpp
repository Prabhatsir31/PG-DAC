#include<fstream>
#include<iostream>
using namespace std;

/*istream& get(char &ch);
reads a single character from the invoking stream and puts that
value in ch.It returns a reference to the stream.

ostream& put(char ch);
writes ch to the stream and returns a reference to the stream */
int main()
{
	char ch;
	ofstream o("c:\\temp\\three.txt");
	if (!o)
	{
		cout << endl << "cannot open a file\n";
		return 0;
	}
	int i = 0;
	for (i = 65; i <= 150; i++)
	{
		o.put((char)i);
	}
	o.close();
	ifstream in("c:\\temp\\three.txt");
	if (!in)
	{
		cout << endl << "can not open file\n";
		return 0;
	}
	while (in.get(ch))
	{
		cout << endl << ch << endl;
	}
	in.close();
	return 0;
}
