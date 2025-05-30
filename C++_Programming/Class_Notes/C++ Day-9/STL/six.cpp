#include<iostream>
#include<algorithm>
#include<vector>
using namespace std;
int main()
{
	vector<bool> v;
	int i = 0;
	size_t cnt = 0;
	for (i = 0; i < 10; i++)
	{
		if (i % 2)
		{
			v.push_back(true);
		}
		else
		{
			v.push_back(false);
		}
	}
	for (i = 0; i < v.size(); i++)
	{
		cout << endl << v[i] << endl;
	}
	cnt = count(v.begin(), v.end(), true);
	cout << endl << "there are \t" << cnt << "\t true\n";
}

