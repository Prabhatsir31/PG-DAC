#include<iostream>
using namespace std;
class MyClass
{
	private:
		int num;
	public:
		void setNum(int);
		int getNum();
};
void MyClass::setNum(int k)
		{
			this->num=k;
		}
int  MyClass::getNum()
		{
			return num;
		}
int main()
{
	int req;		
	cout<<"enter how many records\n";
	cin>>req;
	MyClass *m=new MyClass[req];
	int i,num;
	cout<<"enter  "<<req<<"  numbers\n";
	for(i=0;i<req;i++)
	{
		cin>>num;
		m[i].setNum(num);
	}
	for(i=0;i<req;i++)
	{
		cout<<endl<<m[i].getNum()<<endl;
	}

	delete []m;
}