//Random Access File
#include<fstream>
#include<iostream>
using namespace std;
int main()
{
	/*
	ios:: in for reading
	ios:: out for writing
	ios:: trunc  for will truncate the file if it exists
	(i.e., clear its contents) and create a new file 
	if it doesn’t exist.
	*/

	fstream ff("c:\\temp\\fourth.txt", ios::in | ios::out | ios::trunc);
	int i = 65;
	char ch;
	for (i = 65; i < 100; i++)
	{
		ff.put((char)i);
	}

	ff.seekg(0, ios::beg); // moving get pointer
	while (ff.get(ch))
	{
		cout << endl << ch << endl;
	}

	ff.close();
	return 0;
}
