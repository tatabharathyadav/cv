#include<iostream>
#include<string>
using namespace std;
enum movie{kgf=1;RRR=2;eega=3;f2=4;f3=5};
class Overload
{
	public:
   int i,n;
	void movie(int x)
	{
		cout<<"the rank of the RRR in the list is"<<endl;
	}
	void movie(int p,int q)
	{
		cout<<"the rank of the RRR,kgf is"<<""<<p<<""<<q<<endl;
	}
};
int main()
{
	void movie()
	{
		int i,n;
		cout<<"top 5 amazing movies in 2022 are:"<<endl;
		cout<<"$$"<<endl;
		cout<<"1.kgf\n";
		cout<<"2.RRR\n";
		cout<<"3.eega\n";
		cout<<"4.f2\n";
		cout<<"5.f3\n"<<endl;
		cout<<"enter your rank choice"<<endl;
		cin>>n;
		switch(n)
		{
			case 1:
				cout<<"the movie is kgf"<<endl;
				break;
				case 2:
					cout<<"the movie is RRR"<<endl;
					break;
					case 3:
					cout<<"the movie is eega"<<endl;
					break;
					case 4;
					cout<<"the movie is f2"<<endl;
					break;
					case 5;
					cout<<"the movie is f3"<<endl;
					break;
					default:
						cout<<"error!"<<endl;
						break;
	}
					
		}
	overload abc;
	abc.movie()
	abc.movie(RRR);
	abc.movie(RRR,kgf);
}



