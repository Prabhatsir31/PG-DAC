// using dynamic_cast
#include<iostream>
using namespace std;
class Course
{
public:
	virtual void start()=0;
};
class Predac:public Course
{
public:
	void start()
	{
		cout<<"starting predac"<<endl;
	}
};
class Basic:public Course
{
public:
	void start()
	{
		cout<<"starting basic"<<endl;
	}
};
class Dac:public Course
{
public:
	void start()
	{
		cout<<"starting Dac"<<endl;
	}
	void orientation()
	{
		cout<<"Welcome to Dac Orientation"<<endl;
	}
};
void caller(Course *ptr)
{
	ptr->start();
	Dac *d=dynamic_cast<Dac*>(ptr);
	if(d)
	{
		d->orientation();
	}
}
int main()
{
	caller(new Predac);
	caller(new Basic);
	caller(new Dac);
}
