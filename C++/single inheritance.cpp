#include<iostream>
using namespace std;
class B
{
	int a;
	public:
	int b;
	int get_ab();
	int get_a();
	void show_ab();	
};
class D:private B
{
	int c;
	public:
	int mul();
	int display();
};
int B::get_ab()
{
	a=5;
	b=25;
}
int B::get_a()
{
	return a;
}
void B::show_ab()
{
	cout<<"a value="<<a<<endl;
	cout<<"b value="<<b<<endl;
}
int D::mul()
{
	c=get_a()*b;
}
int D::display()
{
	cout<<"multiplication= "<<c<<endl;
}
int main()
{
	D d;
	d.get_ab();
	d.show_ab();
	d.mul();
	d.display();
	return 0;
}
