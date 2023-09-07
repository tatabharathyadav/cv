#include<iostream>
using namespace std;
class student
{
	int rollno;
	string name;
	public:
	int getstudent(int i)
	{
		cout<<"enter student"<<i+1<<"details\n";
		cout<<"rollno "<<endl;
		cin>>rollno;
		cout<<"name "<<endl;
		cin>>name;
	}
	int showdetails()
	{
		cout<<"rollno of the student"<<rollno<<endl;
		cout<<"name of the student"<<name<<endl;
	}
};
int main()
{
	int size;
	int i;
	cout<<"enter the number of students in the class"<<endl;
	cout<<"size of  array"<<endl;
	cin>>size;
	student *ptr=new student[size];
	for(i=0;i<3;i++)
	{
		ptr[i].getstudent(i);
	}
	for(i=0;i<3;i++)
	{
		ptr[i].showdetails();
	}
}

