#include<iostream>
using namespace std;
class employee
{
	float e_no;
	char name[20],city[10];
	public:
	void details()
	{
		cout<<"enter name\n";
		cin>>name;
		cout<<"enter city\n";
		cin>>city;
		cout<<"enter employee number\n";
		cin>>e_no;
	}
	void display()
	{
		cout<<"name of employee "<<name<<endl;
		cout<<"employee number"<<e_no<<endl;
		cout<<"employee city"<<city<<endl;
	}
};
int main()
{
	employee obj;
	employee *ptr;
	ptr=&obj;
	ptr->details();
	ptr->display();
	return 0;
	
}
