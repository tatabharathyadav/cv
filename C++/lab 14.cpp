#include<iostream>
using namespace std;
class student
{
	int id;
	string name;
	public:
	void getstu()
	{
		cout<<"enter data"<<endl;
		cin>>id>>name;
	}
	void displaystu()
	{
		cout<<"id= "<<id<<endl;
		cout<<"name= "<<name<<endl;
	}
};
class marks:public student
{
	protected:
	int m1,m2,m3;
	public:
	void getmarks()
	{
		cout<<"enter marks"<<endl;
		cin>>m1>>m2>>m3;
	}
	void showmarks()
	{
		cout<<"m1= "<<m1<<endl;
		cout<<"m2= "<<m2<<endl;
		cout<<"m3= "<<m3<<endl;
	}
};
class result:public marks
{
	int total;
	float avg;
	public:
	void display()
	{
		total=m1+m2+m3;
		avg=total/3;
		cout<<"avg= "<<avg<<endl;
	}
};
int main()
{
	result s;
	s.getstu();
	s.displaystu();
	s.getmarks();
	s.showmarks();
	s.display();
}









