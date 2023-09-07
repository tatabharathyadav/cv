#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node *left,*right;
};
typedef struct node *nodeptr;
nodeptr getNode();
nodeptr create(nodeptr);
void insert(nodeptr,nodeptr);
void inorder(nodeptr);
void preorder(nodeptr);
void postorder(nodeptr);
void del(nodeptr ,int );
void del1(nodeptr ,nodeptr );
void nochild(nodeptr,nodeptr );
void leftchild(nodeptr,nodeptr);
void rightchild(nodeptr,nodeptr);
void twochilds(nodeptr,nodeptr);
nodeptr minvaluenoderightsubtree(nodeptr);
int main()
{
    nodeptr tree;
	int a,ch;
	tree=NULL;
	tree=create(tree);
    {
        printf("\n*****MENU******\n"); 
        printf("\n1.deleting node\n2.in order\n3.pre order\n4.post order\n5.exit\n");
        printf("enter your choice:");
        scanf("%d",&ch);
        switch(ch)
        {
        	case 1: printf("\nEnter the element to be delete:");
				    scanf("%d",&a);
				    del(tree,a);
				    break;
            case 2: printf("\nelements in in oreder is:\n"); 
                    inorder(tree);
                    break;
            case 3: printf("\nelements in pre order is:\n");
                    preorder(tree); 
                    break;
            case 4: printf("\nelements in pre order is:\n");
                    postorder(tree); 
                    break;
            case 5: exit(0);
        }
    }
}
nodeptr getNode()
{
    nodeptr p;
    p=(nodeptr)malloc(sizeof(struct node));
    p->data =0;
    p->left = NULL;
    p->right = NULL;
    return p;
}

nodeptr create(nodeptr root)
{
    nodeptr newnode;
    newnode = getNode();
    printf("\nEnter at end -99\n");
    printf("\nEnter the number:"); 
    scanf("%d",&newnode->data);
    while (newnode->data!=-9)
    {
        if(root == NULL)
        {
            root = newnode;
        }
        else
        {
            
            insert(root,newnode);
            newnode = getNode();
            printf("\nEnter the number:"); 
            scanf("%d",&newnode->data);
        }
    }
    return root;    
}
void insert(nodeptr root, nodeptr newnode)
{

    if (newnode->data < root->data) {
      if (root->left == NULL)
         root->left = newnode;
      else
         insert(root->left, newnode);
   }

   if (newnode->data > root->data) {
      if (root->right == NULL)
         root->right = newnode;
      else
         insert(root->right, newnode);
   }
}



void inorder(nodeptr temp) 
{
   if (temp != NULL) {
      inorder(temp->left);
      printf("%d --> ", temp->data);
      inorder(temp->right);
   }
}

void preorder(nodeptr temp)
{
   if (temp != NULL) {
      printf("%d --> ", temp->data);
      preorder(temp->left);
      preorder(temp->right);
   }
}

void postorder(nodeptr temp)
{
   if (temp != NULL) {
      postorder(temp->left);
      postorder(temp->right);
      printf("%d --> ", temp->data);
   }
}
void del(nodeptr p,int a)
{
	nodeptr parent;
	parent=p;
	if(p==NULL)
	{
		printf("elt not found");
	}
	else
	{
		while(p->data!=a)
		{
			if(a<p->data)
			{
				parent=p;
				p=p->left;
			}
			else
			{
				parent=p;
				p=p->right;                                                                
			}
		}
	    if(p->data==a)
	    {
		    printf("elt found");
		    del1(parent,p);
	    }
	}
}
void del1(nodeptr parent,nodeptr p)
{
	if((p->left==NULL)&&(p->right==NULL))
	{
		nochild(parent,p);
	}
	else if((p->left==NULL)&&(p->right!=NULL))
	{
		rightchild(parent,p);
	}
	else if((p->left!=NULL)&&(p->right==NULL))
	{
		leftchild(parent,p);
	}
	else if((p->left!=NULL)&&(p->right!=NULL))
	{
		twochilds(parent,p);
	}
}
void nochild(nodeptr parent,nodeptr p)
{
	if(parent->left==p)
	{
		parent->left=NULL;
	}
	else
	{
		parent->right=NULL;
	}
	free(p);
}
void leftchild(nodeptr parent,nodeptr p)
{
	if(parent->left==p)
	{
		parent->left=p->left;
	}
	else
	{
		parent->right=p->left;
		p->left=NULL;
	}
	free(p);
}
void rightchild(nodeptr parent,nodeptr p)
{
	if(parent->left==p)
	{
		parent->left=p->right;
	}
	else
	{
		parent->right=p->right;
		p->right=NULL;
	}
	free(p);
}
void twochilds(nodeptr parent,nodeptr p)
{
	int k;
	nodeptr temp;
	temp=minvaluenoderightsubtree(p->right);
	printf("max in right sub tree is %d",temp->data);
	k=p->data;
	p->data=temp->data;
	temp->data=k;
	del(parent->right,temp->data);
}
nodeptr minvaluenoderightsubtree(nodeptr p)
{
	while(p->left!=NULL)
	{
		p=p->left;
	}
	return p;
}



