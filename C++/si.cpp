#include<iostream>
using namespace std;
class Base
{
	public:
		 int a=5;
		int  b=5;
};
class Derived:private Base
{
	public:
		void mul()
		{
			cout<<a*b;
		}
};
int main()
{
	Derived d;
	d. mul();	
}
