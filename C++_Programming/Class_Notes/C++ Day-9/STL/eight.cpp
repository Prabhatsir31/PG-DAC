#include<stack>
#include<iostream>
using namespace std;
struct emp
{
	char name[20];
	int age;
};
ostream& operator<<(ostream &o,emp &m)
	{
		o<<m.name<<"\t"<<m.age<<endl;
		return o;
	}

int main()
{
	struct emp e1={"abc",30};
	struct emp e2={"xyz",10};
	struct emp e3={"pqr",80};
	struct emp e4={"lmn",50};

	stack<emp> v;
	v.push(e1);
	v.push(e2);
	v.push(e3);
	v.push(e4);
	cout<<"size of stack is\t"<<v.size()<<endl;
	while(!v.empty())
	{
		cout<<endl<<v.top();
		v.pop();
	}
	cout<<"size of stack after pop is\t"<<v.size()<<endl;
}
