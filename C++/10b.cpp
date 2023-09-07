#include<iostream>
using namespace std;
class Employee
{
	int Emp_number;
	string Emp_name;
	float Emp_basic;
	float Emp_da;
	float Emp_gross;
	float Emp_it;
	float Emp_net_sal;
	public:
	void get_Emp_details();
	float find_net_salary();
	void show_Emp_details();
};
void Employee::get_Emp_details()
{
	cout<<"enter Employee number";
	cin>>Emp_number;
	cout<<"enter Employee name";
	cin>>Emp_name;
	cout<<"enter basic salary";
	cin>>Emp_basic;
	
}
float Employee::find_net_salary()
{
	Emp_da=Emp_basic*0.60;
	Emp_gross=Emp_da+Emp_basic;
	Emp_it=Emp_gross*0.50;
	Emp_net_sal=Emp_gross-Emp_it;
	return Emp_net_sal;
}
void Employee::show_Emp_details()
{
	cout<<"Employee number:"<<Emp_number<<endl;
    cout<<"Employee name:"<<Emp_name<<endl;
	cout<<"basic salary:"<<Emp_basic<<endl;
    cout<<"Employee da:"<<Emp_da<<endl;
	cout<<" gross salary:"<<Emp_gross<<endl;
	cout<<"it:"<<Emp_it<<endl;
	cout<<"net salary"<<Emp_net_sal<<endl;
					
					
					
}
int main()
{
	int noemp;
	Employee e[noemp];
	for (int i=0;i<noemp;i++)
	e[i].get_Emp_data();
	e[i].find_net_salary();
	e[i].display_data();
	return 0;
}








