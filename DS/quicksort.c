#include<stdio.h>
void quicksort(int[],int,int);
int partition(int[],int,int);
int main()
{
	int a[10],i,j,n,low,high;
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
    quicksort(a,0,n);
	printf("after sorting:");
	for(i=1;i<=n;i++)
	{
		printf("%d",a[i]);
	}
	return 0;
}
void quicksort(int a[10],int low,int high)
{
	int j;
	if(low<high)
	{
		j=partition(a,low,high+1);
		quicksort(a,low,j-1);
		quicksort(a,j+1,high);
	}
}
int partition(int a[10],int low,int high)
{
	int i,j,temp,pivot;
	i=low;
	pivot=a[low];
	j=high;
	while(i<j)
	{
		while(a[i]<=pivot && i<high)
		{
			i++;
		}
		while(a[j]>pivot && j>low)
		{
			j--;
		}
		if(i<j)
		{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
	temp=a[low];
	a[low]=a[j];
	a[j]=temp;
	return j;	
}

