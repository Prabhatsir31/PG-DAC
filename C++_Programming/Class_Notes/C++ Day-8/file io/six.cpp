//Random Access File
#include<fstream>
#include<iostream>
using namespace std;
int main()
{
	fstream ff("c:\\temp\\fourth.txt", ios::in | ios::out | ios::trunc);
	struct emp
	{
		char name[20];
		int age;
	}e[3] = { {"abc",30},{"xyz",25},{"lmn",10} };
	struct emp e1;
	cout << sizeof(e) << endl;
	ff.write((char*)e, sizeof(e));

	ff.seekg(0, ios::beg); // moving get pointer
	while (ff.read((char*)&e1, sizeof(e1)))
	{
		cout << e1.name << "\t" << e1.age << endl;
	}
	cout << "lets read again!" << endl;
	//ff.clear(); //this is must
	ff.seekg(0, ios::beg);

	while (ff.read((char*)&e1, sizeof(e1)))
	{
		cout << e1.name << "\t" << e1.age << endl;
	}
	ff.close();
	return 0;
}
