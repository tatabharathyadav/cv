#include<iostream>
using namespace std;
int addof4numbers(int a,int b,int c=15,int d=10)
{
	return a+b+c+d;
}
int main()
{
	cout<<"add of 4 numbers"<<addof4numbers(3,8)<<endl;
	cout<<"add of 4 numbers"<<addof4numbers(3,8,8)<<endl;
	cout<<"add of 4 numbers"<<addof4numbers(3,8,5,2)<<endl;
	cout<<"add of 4 numbers"<<addof4numbers(3,8,1)<<endl;
	return 0;
}
