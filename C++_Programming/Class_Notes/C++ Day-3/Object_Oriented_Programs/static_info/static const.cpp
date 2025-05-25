#include<iostream>
using namespace std;
class myclass
{
private:
	static const int cnt;
public:
	myclass()
	{
	}
	static void show()
	{
		cout<<cnt<<endl;
	}
};
const int myclass::cnt=10;
int main()
{
	myclass::show();
}