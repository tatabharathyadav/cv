#include<iostream>
using namespace std;
class base
{
	public:
	int x;
	static int y;
};
int base::y;
int main()
{
	base b1;
	b1.x=10;
	b1.y=30;
	base b2;
	b2.x=20;
	b2.y=50;
	cout<<b1.x<<endl;
	cout<<b1.y<<endl;
	cout<<b2.x<<endl;
	cout<<b2.y<<endl;
}
