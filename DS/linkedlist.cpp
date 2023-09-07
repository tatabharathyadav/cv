#include<iostream>
using namespace std;
template<class T>
class linked
{
	public:
	T data;
	linked *next;
	linked *head=NULL;
	T insert_begin(T d)
	{
		linked *ptr=new linked();
		ptr->data=d;
		ptr->next=head;
		head=ptr;
	}
	T display()
	{
		linked *temp=new linked();
		temp=head;
		while(temp!=NULL)
		{
		cout<<"element is "<<temp->data<<endl;
		temp=temp->next;
	}
	}
};
int main()
{
	linked<float>l;
	l.insert_begin(30);
	l.insert_begin(20);
	l.insert_begin(10);
	l.insert_begin(50);
	l.insert_begin(40);
	l.display();
	return 0;
}

