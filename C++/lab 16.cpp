#include<iostream>
using namespace std;
class Base
{
	public:
	virtual int display()
	{
		cout<<"Base class display"<<endl;
	}
	int show()
	{
		cout<<"Base class show"<<endl;
	}
};
class Derived:public Base
{
	public:
	int display()
	{
	cout<<"derived class display"<<endl;
	}
	int show()
	{
		cout<<"derived class show"<<endl;
	}
};
int main()
{
	Base obj1;
	Derived obj2;
	Base *ptr1;
	ptr1=&obj2;
	ptr1->display();
	ptr1->show();
	return 0;
}







