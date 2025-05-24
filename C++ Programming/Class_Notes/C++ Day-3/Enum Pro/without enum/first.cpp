#include<iostream>
using namespace std;
class MyFont
{
public:
	static const int PLAIN=0;
	static const int BOLD=1;
	static const int ITALIC=2;
};

class MyComponent
{
public:
	void setStyle(int style)
	{
		switch (style)
		{
		case 0: cout << "plain" << endl;
			break;
		case 1: cout << "bold" << endl;
			break;
		case 2: cout << "italic" << endl;
			break;
		default: cout << "unpredictable color" << endl;
		}
	}
};
int main()
{
	MyComponent mc;
	mc.setStyle(MyFont::BOLD);
	mc.setStyle(MyFont::ITALIC);
	//	mc.setStyle(MyFont::plain); //Error
	mc.setStyle(1); // saves typing
	mc.setStyle(6); // can be risky
}
