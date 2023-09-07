#include<stdio.h>
#include<stdlib.h>
struct node
{
	int data;
	struct node* next;
};
struct node *getnode();
struct node *create();
struct node *insert(struct node *);
struct node *deleted(struct node *);
void traversal(struct node *);
struct node *reverse(struct node *);
int main()
{
	int ch;
	struct node* start;
	start=create();
	traversal(start);
	while(1)
	{
		printf("\n****menu****\n");
		printf("\n1.insertion\n2.display\n3.deletion\n4.reverse\n5.exit\n");
		printf("enter your choice:");
		scanf("%d",&ch);
		switch(ch)
		{
			case 1:
				start=insert(start);
				traversal(start);
				break;
			case 2:
				traversal(start);
				break;
			case 3:
				start = deleted(start);
                traversal(start);
                break;
			case 4:
				start=reverse(start);
				traversal(start);
				break;
			case 5:
				exit(0);
		}
		
	}
}
struct node *getnode()
{
	struct node* np;
	np=(struct node*)malloc(sizeof(struct node));
	np->data=0;
	np->next=NULL;
	return  np;
}
struct node *create()
{
	struct node *head, *first, *newnode;
	first=getnode();
	head=first;
	newnode=getnode();
	printf("enter element except -99");
	scanf("%d",&newnode->data);
	while(newnode->data!=-99)
	{
		first->next=newnode;
		first=newnode;
		newnode=getnode();
		printf("enter element except -99");
	    scanf("%d",&newnode->data);
	}
	return head;
}
void traversal(struct node* head)
{
	struct node* temp;
	temp=head;
	while(temp!=NULL)
	{
		printf("%d->",temp->data);
		temp=temp->next;
	}
}
struct node *reverse(struct node *head)
{
	struct node *temp,*newnode,*rhead;
	temp=head;
	rhead=getnode();
	rhead->data=temp->data;
	while(temp->next!=NULL)
	{
		temp=temp->next;
		newnode=getnode();
		newnode->data=temp->data;
		newnode->next=rhead;
		rhead=newnode;
	}
	return rhead;
}
struct node *insert(struct node *head)
{
	int ch,pos,i;
	struct node* temp,*newnode;
	temp=head;
	newnode = getnode();
	printf("enter the insert number:");
	scanf("%d",&newnode->data);
	printf("\n1.at begining\n2. at end\n3. at given position");
    printf("\nenter your choice:");
    scanf("%d", &ch);
    switch (ch)
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
			printf("enter the specific position");
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
		defult:
			break;
	}	
}




