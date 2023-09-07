#include<iostream>
using namespace std;
void swap(int*,int*);
int main()
{
	int a,b;
	cout<<"enter value of a"<<endl;
	cin>>a;
	cout<<"enter value of b"<<endl;
	cin>>b;
	cout<<"before swapping,value of::\n\t a="<<a<<"\t b="<<b<<"\n";
	swap(&a,&b);
	cout<<" after swapping value of::\n\t a="<<a<<"\t b="<<b<<"\n";
}
void swap(int*a,int*b)
{
	int c;
	c=*a;
	*a=*b;
	*b=c;
	cout<<"inside function after swapping,value of::\n\tA="<<*a<<"\tB="<<*b<<"\n";

}
