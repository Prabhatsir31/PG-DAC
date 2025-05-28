#include<iostream>
using namespace std;
class myclass
{
public:
	virtual void disp1()
	{
		cout << endl << "in disp1\n";
	}
	virtual void disp2()
	{
		cout << endl << "in disp2\n";
	}
	void trial()
	{
		__int64 * ptr1 = (__int64 *)this;//address of the object
		ptr1 = (__int64 *)*ptr1;//address of the VTABLE
		ptr1 = (__int64 *)*ptr1;//address of the first virtual function
		void (*fun1)();
		fun1 = (void (*)())ptr1;
		fun1();  // disp1 will be called here
		__int64 * ptr2 = (__int64 *)this;//address of the object
		ptr2 = (__int64 *)*ptr2;//address of the VTABLE
		
		ptr2++;//increment so that pointer will point to the next 
		// 8 byte chunk
		
		ptr2 = (__int64*)*ptr2;//address of second virtual function
		void (*fun2)();
		fun2 = (void(*)())ptr2;
		fun2();  // disp2 will be called here
	}
};
int main()
{
	myclass m;
	m.trial();
}

