#include<stdio.h>
#include<stdlib.h>
#define max 5
struct stack
{
	int items[max];
	int top;
};
void push(struct stack*,int);
void display(struct stack*);
void pop(struct stack*);
void peek(struct stack*);
void isempty(struct stack*);
int main()
{
	struct stack st;
	st.top=-1;
	int ele;
	int ch;
	while(1)
	{
		printf("\n*******\n");
		printf("ENTER MENU:\n");
		printf("1.push\n2.pop\n3.peek\n4.display\n5.isempty\n6.exit\n");
		printf("enter to choose:");
		scanf("%d",&ch);
		switch(ch)
		{
			case 1:
				printf("enter element to insert:");
				scanf("%d",&ele);
				push(&st,ele);
				break;
			case 2:
				pop(&st);
				break;
			case 3:
				peek(&st);
				break;
			case 4:
				display(&st);
				break;
			case 5:
				isempty(&st);
				break;
			case 6:
				exit(0);
				break;
			default:
				printf("invalid choose");
				break;
		}
	}
}
void push(struct stack *stp,int ele)
{
	if (stp->top==max-1)
	{
		printf("overflow");
	}
	else
	{
		stp->top=stp->top+1;
		stp->items[stp->top]=ele;
	}
}
void display(struct stack *stp)
{
	int i;
	if (stp->top==-1)
	{
		printf("underflow");
	}
	else
	{
		for(i=stp->top;i>=0;i--)
		{
			printf("|%d|\n",stp->items[i]);
		}
	}
}
void pop(struct stack *stp)
{
	int ele;
	if(stp->top==-1)
	{
		printf("underflow");
	}
	else
	{
		ele=stp->items[stp->top];
		stp->top=stp->top-1;
		printf("poped elt is %d",ele);
	}
}
void peek(struct stack *stp)
{
	int ele;
	if(stp->top==-1)
	{
		printf("underflow");
	}
	else
	{
		ele=stp->items[stp->top];
		printf("peek elt is %d",ele);
	}
}
void isempty(struct stack*stp)
{
	if(stp->top==-1)
	{
		printf("empty");
	}
	else
	{
		printf("not empty");
	}
}

