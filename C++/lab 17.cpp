#include<iostream>
using namespace std;
template<class t>
class Test
{

	public:
	Swape(t x,t y)
	{
	//cout<<"before Swape"<<a<<b<<endl;
	t temp;
	temp=x;
	x=y;
	y=temp;
	cout<<"x= "<<x<<"y= "<<y<<endl;
    }
};

int main()
{
	Test<int>c;
	int a=2,b=3;
	cout<<"a= "<<a<<"b= "<<b<<endl;
	c.Swape(a,b);
	return 0;

}
