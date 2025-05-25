/* 
new 
a) it is like malloc or calloc
b) it is used to allocate memory dynamically from heap or free store.
c) it is an operator and not a function.
d) no need to use sizeof in case of new
e) new invokes constructor 
*/

/*
delete
a) it is like free
b) it is used to deallocate memory which is allocated dynamically.
c) it is an operator and not a function.
d) it invokes destructor.
*/

#include<iostream>
using namespace std;
int main()
{
	int* ptr, rec, i;
	cout << "\nHow many numbers ?\n";
	cin >> rec;
	ptr = new int[rec];
	cout << "\nEnter  " << rec << " numbers\n";
	for (i = 0; i < rec; i++)
	{
		cin >> ptr[i];
	}
	cout << "\n Displaying all nos\n";
	for (i = 0; i < rec; i++)
	{
		cout << endl << ptr[i] << endl;
	}
	//delete(ptr);
	//delete ptr;
	delete[]ptr;
	return 0;
}
