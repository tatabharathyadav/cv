#include<iostream>
using namespace std;
class Student
{
	int id;
	string name;
	public:
		getstu()
		{
			cout<<"enter the data\n";
			cout<<"id=";
			cin>>id;
			cout<<"name=";
			cin>>name;
		}
		showstu()
		{
			cout<<"id="<<id<<endl;
			cout<<"name="<<name<<endl;
		}
};
class Test:public Student
{
	public:
		int m1,m2,m3;
		int get_marks()
		{
			cout<<"enter a 3 sub marks";
			cin>>m1>>m2>>m3;
		}
		void showmarks()
		{
			cout<<"m1= "<<m1<<endl;
			cout<<"m2= "<<m2<<endl;
			cout<<"m3= "<<m3<<endl;
		}
};
class Result:public Test
{
	public:
	int total;
	int avg;
	int display()
	{
		total=m1+m2+m3;
		avg=total/3;
		cout<<"AVG= "<<avg;
	}
	};
	int main()
	{
		Result r;
		r.getstu();
		r.get_marks();
		r.showstu();
		r.showmarks();
		r.display();	
		return 0;
	}
	
	
		
		
