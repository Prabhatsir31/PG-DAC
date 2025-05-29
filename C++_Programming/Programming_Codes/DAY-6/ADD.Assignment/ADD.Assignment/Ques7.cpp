//7) Define a class as "MyString"
//
//members
//char* str;
//int len;
//
//member functions
//void disp()
//int length()
//
//in main functions u should be able to do following things
//
//a) MyString m1("Sachin");
//m1.disp();
//
//b) cout << m1.length();
//
//c) MyString m2 = m1;
//m2.disp();
//
//d) MyString m3("Rahul");
//m3.disp();
//
//e) m2 = m3;
//m2.disp();
//
//f) cout << m2[1];
//
//g) m3[0] = 'K'
//m3.disp();
//
//h) m3 = m1 + m2;
//m3.disp();

//#include<iostream>
//using namespace std;
//class MyString
//{
//private:
//	char* str;
//	size_t len;
//public:
//	MyString(const char* ptr)
//	{
//		str = new char[strlen(ptr) + 1];
//		strcpy_s(str, strlen(ptr) + 1, ptr);
//		len = strlen(str);
//	}
//	MyString(const MyString& ref)
//	{
//		str = new char[strlen(ref.str) + 1];
//		strcpy_s(str, strlen(ref.str) + 1, ref.str);
//		len = strlen(ref.str);
//	}
//	MyString& operator=(const MyString& ref)
//	{
//		if (str != NULL)
//		{
//			delete[]str;
//		}
//		str = new char[strlen(ref.str) + 1];
//		strcpy_s(str, strlen(ref.str) + 1, ref.str);
//		len = strlen(ref.str);
//		return *this;
//	}
//	char& operator[](unsigned int k)
//	{
//		char ch = ' ';
//		if (k >= 0 && k < strlen(str))
//		{
//			return str[k];
//		}
//		else
//		{
//			return str[strlen(str)];
//		}
//	}
//	void disp()
//	{
//		cout << str << endl;
//	}
//	size_t length()
//	{
//		return strlen(str);
//	}
//	~MyString()
//	{
//		cout << "inside destructor" << endl;
//		delete[]str;
//	}
//	MyString operator+(MyString& ref)
//	{
//		char* ptr = new char[strlen(str) + strlen(ref.str) + 1];
//		strcpy_s(ptr, strlen(str) + 1, str);
//		strcat_s(ptr, strlen(str) + strlen(ref.str) + 1, ref.str);
//		cout << "ptr is\t" << ptr << endl;
//		//return MyString(ptr);  // memory leak can happen here
//		MyString mm(ptr);
//		delete[]ptr;  // release ptr
//		return mm;
//	}
//};
//int main()
//{
//	MyString m1("sachin");
//	m1.disp();
//	cout << m1.length() << endl;
//	MyString m2 = m1;
//	m2.disp();
//	MyString m3("Rahul");
//	m2 = m3;
//	m2.disp();
//	cout << m2[1] << endl;
//	m3[0] = 'K';
//	m3.disp();
//	m3 = m1 + m2;
//	m3.disp();
//}




