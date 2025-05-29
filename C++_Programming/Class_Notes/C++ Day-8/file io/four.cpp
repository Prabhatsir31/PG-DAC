#include<fstream>
#include<iostream>
using namespace std;
/* istream& read(char *,streamsize num)
reads num characters from invoking stream and puts them in
buffer.
ostream& write(char *,streamsize num)
writes num characters to the invoking stream from the buffer

  streamsize defined by c++ library as some form of integer.it is
  capable of holding the largest no.of chrs. that can be
  transfered in any one i/o operation */
int main()
{
	size_t total = 0;
	struct emp
	{
		char name[20];
		int age;
	}e[3] = { {"abc",30},{"xyz",26},{"lmn",10} };
	struct emp e1;
	ofstream o("c:\\temp\\four.txt", ios::binary);
	o.write((char*)&e, sizeof(e));
	o.close();
	ifstream i("c:\\temp\\four.txt", ios::binary);
	//ifstream i("c:\\temp\\four.txt");
	while (i.read((char*)&e1, sizeof(struct emp)))
	{
		cout << e1.name << "\t" << e1.age << endl;
		total += i.gcount();
	}
	cout << endl << "after reading\n";
	i.close();
	cout << endl << "no of chrs read\t" << total << endl;
	return 0;
}
