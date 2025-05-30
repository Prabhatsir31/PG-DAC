/* Example of class template
Class templates are usually used for data storage(container) classes.
Stack ,Linked Lists are the examples of container classes.
i.e using one single class you can have any data type(int,char,float etc.), Stack or Linked List implementation.
*/

#include<iostream>
using namespace std;

template<class type1>
class MyClass
{
	private:
		type1 a;
	public:
		MyClass(type1 a)
		{
			this->a=a;
		}
		void disp()
		{
			cout<<endl<<a<<endl;
		}
};
void main()
{
	MyClass<int>s1(10);
	MyClass<char>s2('A');
	MyClass<double>s3(10.5);
	s1.disp();
	s2.disp();
	s3.disp();
}
	








	