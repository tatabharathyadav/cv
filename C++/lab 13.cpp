#include<iostream>
using namespace std;
class Rectangle
{
	int length,width;
	public:
	Rectangle()
	{
		length=10;
		width=5;
	}
	Rectangle(int l,int w)
	{
		length=l;
		width=w;
	}
	void area()
	{
		cout<<"area of Rectangle is="<<length*width<<endl;
	}
};
int main()
{
	Rectangle *obj1,*obj2;
	obj1=new Rectangle();
	obj2=new Rectangle(10,9);
	obj1->area();
	obj2->area();
	return 0;
}
