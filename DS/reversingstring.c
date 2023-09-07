#include<stdio.h>
#include<stdlib.h>
#define max 5
struct stack
{
	int items[max];
	int top;
};
int main()
{
    struct stack st;
	st.top=-1;
	int ele;
	int i,n;
	int a[10];
	printf("enter no of elements:");
	scanf("%d",&n);
	printf("enter elements");
	
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	} 
    for(i=0;i<n;i++)
    {
     	push();
    }
    for(i=0;i<n;i++)
   {
	    pop();
   }
}
void push(struct stack st,int ele)
{
	int top;
    int items[top];
	if (top==max-1)
	{
		printf("overflow");
	}
	else
	{
		top=top+1;
		items[top]=ele;
	}
}
void pop(struct stack st)
{
	int ele;
	int top;
	int items[top];
	if(top==-1)
	{
		printf("underflow");
	}
	else
	{
		ele=items[top];
		top=top-1;
		printf("poped elt is %d",ele);
	}
}
