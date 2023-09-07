#include<iostream>
using namespace std;
struct person
{
	char name[50];
	int age;
	float salary;
};
int main()
{
	person p1;
	cout<<"enter full name"<<endl;
	cin>>p1.name;
	cout<<"enter age"<<endl;
	cin>>p1.age;
	cout<<"enter salary"<<endl;
	cin>>p1.salary;
	cout<<"displaying information";
	cout<<"name= "<<p1.name<<endl;
	cout<<"enter age= "<<p1.age<<endl;
	cout<<"enter salary"<<p1.salary<<endl;
}
