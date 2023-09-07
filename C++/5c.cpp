#include<iostream>
using namespace std;
class Test
{
	public:
	int fun1(int a,int b)
	{
		cout<<"a+b= "<<a+b<<endl;
	}
	int fun2(int a,int b,int c)
	{
		cout<<"a+b+c= "<<a+b+c<<endl;
	}
};
int main()
{
	Test t;
	enum days{sun,mon,tue=5,wed,thu,fri,sat
	};
	t.fun1(mon,sat);
	t.fun2(tue,sat,fri);
}
