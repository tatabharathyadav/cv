#include<stdio.h>
#include<stdlib.h>
struct node
{
	int data;
	struct node *next;
};
struct node *getnode();
struct node *create();
void traversal(struct node *);
struct node *insertion(struct node *);
struct node *deleted(struct node *);
int main()
{
	int ch;
	struct node *start;
	start=create();
	traversal(start);
	while(1)
	{
		printf("\n****************MENU***************\n\n");
		printf("1.insertion\n2.deletion\n3.display\n4.exit\n");
		printf("enter your choice");
		scanf("%d",&ch);
		switch(ch)
		{
			case 1:
				start=insertion(start);
				traversal(start);
				break;
			//case 2:
				start=deleted(start);
				traversal(start);
				break;
		    case 3:
		    	traversal(start);
		    	break;
		    case 4:
		    	exit(0);
		}
	}
}
struct node *getnode()
{
	struct node *np;
	np=(struct node *)malloc(sizeof(struct node));
	np->data=0;
	np->next=NULL;
	return np;
}
struct node *create()
{
	struct node *head,*first,*newnode;
	first=getnode();
	head=first;
	newnode=getnode();
	printf("enter -99 to stop\n");
	printf("enter value:");
	scanf("%d",&newnode->data);
	while(newnode->data!=-99)
	{
		first->next=newnode;
		first=newnode;
		newnode=getnode();
		printf("enter value");
		scanf("%d",&newnode->data);
	}
	return head->next;
}
void traversal(struct node *head)
{
	struct node *temp;
	temp=head;
	while(temp!=NULL)
	{
		printf("%d->",temp->data);
		temp=temp->next;
	}
} 
struct node *insertion(struct node *head)
{
	int ch,i,pos;
	struct node *temp,*newnode;
	temp=head;
	newnode=getnode();
	printf("enter the number to be insert:");
	scanf("%d",&newnode->data);
	printf("1.insertion at begining\n2.insertion at last\n3.insertion at specified positon\n");
	printf("enter your choice:");
	scanf("%d",&ch);
	switch(ch)
	{
		case 1:
			newnode->next=head;
			head=newnode;
			return head;
			break;
		case 2:
			while(temp->next!=NULL)
			{
				temp=temp->next;
			}
			temp->next=newnode;
			return head;
			break;
		case 3:
			printf("enter position");
			scanf("%d",&pos);
			if(pos==1)
			{
				newnode->next=head;
			    head=newnode;
			    return head;
			}
			else
			{
				for(i=1;i<pos-1;i++)
				{
					temp=temp->next;
				}
				newnode->next=temp->next;
				temp->next=newnode;
				return head;
			}
		default:
			break;
	}
	
	
	
}

