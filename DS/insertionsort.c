#include<stdio.h>
int insertionsort(int[],int);
int main()
{
	int a[10],i,j,n;
	printf("enter size of an array:");
	scanf("%d",&n);
	printf("enter the elements:");
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	printf("before sorting:");
	for(i=0;i<n;i++)
	{
		printf("%d",a[i]);
	}
	insertionsort(a,n);
	printf("after sorting:");
	for(i=0;i<n;i++)
	{
		printf("%d",a[i]);
	}
	return 0;
}
int insertionsort(int a[],int n) 
{
	int i,j,temp;
	for(i=1;i<n;i++)
	{
		temp=a[i];
		for(j=i-1;j>=0;j--)
		{
			if(a[j]>temp)
			{
				a[j+1]=a[j];
			}
			else
			{
				break;
			}
		}
		a[j+1]=temp;
	}
}

