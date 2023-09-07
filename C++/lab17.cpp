#include<iostream>
using namespace std;
template<class t>
class Swape
{

	public:
	Swape(t a,t b)
	{
	cout<<"before Swape"<<a<<b<<endl;
	t temp;
	temp=a;
	a=b;
	b=temp;
	cout<<"after Swape"<<a<<b<<endl;
    }
};

int main()
{
	Swape<int>c(10,20);
	//c.Swape(10,20);

}
