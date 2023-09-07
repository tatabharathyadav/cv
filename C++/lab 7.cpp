#include<iostream>
using namespace std;
class power
{
	public:
	int base;
	int expo;
	int result;
	void getdata(int x,int y)
	{
		base=x;
		expo=y;
	}
	void display()
	{
		int i;
		cout<<"the value is "<<endl;
		for(i=0;i<expo;i++)
		{
			result=result*base;
		}
		cout<<"result= "<<result<<endl;
	}
};
int main()
{
	power p;
	p.getdata(3,2);
	p.display();
}
