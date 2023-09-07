#include<stdio.h>
#include<stdlib.h>
#define max 10
struct queue
{
	int items[max];
	int front,rear;
};
void enqueue(struct queue*,int);
void dequeue(struct queue*);
void display(struct queue*);
int main()
{
	struct queue cq;
	cq.front=-1;
	cq.rear=-1;
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
				enqueue(&cq,ele);
				break;
			case 2:
				dequeue(&cq);
				break;
			case 3:
				display(&cq);
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
void enqueue(struct queue*cq,int ele)
{
	if((cq->rear==max-1 && cq->front==0) || (cq->front=cq->rear+1))
	{
		printf("queue is full");
		return;
	}
	if(cq->rear==-1)
	{
		cq->rear=0;
		cq->front=0;
	}
	else
	{
		if (cq->rear==max-1)
		{
		    cq->rear=0;
	    }
		else
		{
			cq->rear++;
		}
	}
	cq->items[cq->rear]=ele;
}
void dequeue(struct queue*cq)
{
	if(cq->rear==-1)
	{
		printf("queue is empty");
		return;
	}
	printf("deleted elt is %d",cq->items[cq->rear]);
	if(cq->rear==cq->front)
    {
    	cq->rear=cq->front=-1;
	}
	else
	{
		if(cq->front==max-1)
		{
			cq->front=0;
		}
		else
		{
			cq->front++;
		}
	}
}
void display(struct queue*cq)
{
	int i;
	int j;
	if(cq->front==-1)
	{
		printf("queue is empty");
		return;
	}
	else
	{
		printf("queue elts:");
		if(cq->front<=cq->rear)
		{
			for(i=cq->front;i<=cq->rear;i++)
			{
				printf("%d",cq->items[i]);
			}
		}
		else
		{
			for(i=cq->front;i<=max-1;i++)
			{
				printf("%d",cq->items[i]);
			}
			for(j=0;j<=cq->rear;j++)
			{
				printf("%d",cq->items[j]);
			}
		}
	}
}
















