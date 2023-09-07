#include<stdio.h>
#include<stdlib.h>
#define max 10
struct queue
{
	int items[max];
	int front,rear;
};

void enqueue(struct queue*,int);
void dequeue(struct queue *);
void  display(struct queue *);





int main()
{
	struct queue qu;
	qu.front=0;
	qu.rear=-1;
	int ele;
	int ch;
	int i;
	while(1)
	{
		printf("\n*******\n");
		printf("ENTER MENU:\n");
		printf("1.enqueue\n2.dequeue\n3.display\n4.exit\n");
		printf("enter to choose:");
		scanf("%d",&ch);
		switch(ch)
		{
			case 1:
				printf("enter element to insert:");
				scanf("%d",&ele);
				enqueue(&qu,ele);
				break;
			case 2:
				dequeue(&qu);
				break;
			case 3:
				display(&qu);
				break;
			case 4:
				exit(0);
				break;
			default:
				printf("invalid choose");
				break;
		}
	}
	return 0;
}
void enqueue(struct queue *qu ,int ele)
{
	if (qu->rear==max-1)
	{
		printf("queue is full");
	}
	else
	{
		qu->rear=qu->rear+1;
		qu->items[qu->rear]=ele;
	}
}
void dequeue(struct queue *qu)
{
	int ele;
	if(qu->rear<qu->front)
	{
		printf("no elements in queue");
	}
	else
	{
		ele=qu->items[qu->front];
		qu->front++;
		printf("deleted elt is %d",ele);
	}
}
void display(struct queue *qu)
{
	int i;
	if(qu->rear<qu->front)
	{
		printf("underflow");
	}
	else
	{
		for(i=qu->front;i<=qu->rear;i++)
		{
			printf("\n|%d|",qu->items[i]);
		}
	}
}































