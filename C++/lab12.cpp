#include<iostream>
using namespace std;
class Base
{
	public:
	int a=10;
	void display()
	{
		cout<<"I am in base class display"<<endl;
		cout<<"a"<<a<<endl;
	}
};
class derived:public Base 
{
	public:
	int a=30;
	void display()
	{
		cout<<"I am in derived class display"<<endl;
		cout<<"Base a="<<Base::a<<endl;
		cout<<"derived a="<<a<<endl;
	}
};
int main()
{
	derived obj;
	obj.display();
	return 0;
}
