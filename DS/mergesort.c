#include<stdio.h>
void mergesort(int[],int,int);
void merge(int[],int,int,int);
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
    mergesort(a,0,n);
	printf("after sorting:");
	for(i=1;i<=n;i++)
	{
		printf("%d",a[i]);
	}
	return 0;
}
void mergesort(int a[10],int low,int high)
{
	int mid;
	if(low<high)
	{
		mid=(low+high)/2;
		mergesort(a,low,mid);
		mergesort(a,mid+1,high);
		merge(a,low,mid,high);
	}
}
void merge(int a[10],int low,int mid,int high)
{
	int i,j,k;
	int b[10];
	i=low;
	j=mid+1;
	k=low;
	while(i<=mid && j<=high)
	{
	    if(a[i]<a[j])
		{
			b[k]=a[i];
			k++;
			i++;
		}
		else
		{
			b[k]=a[j];
			k++;
			j++;
		}	
	}
	if(i>mid)
	{
		while(j<=high)
		{
			b[k]=a[j];
			k++;
			j++;
		
		}
	}
	else
	{
		while(i<=mid)
		{
			b[k]=a[i];
			k++;
			i++;
		}
	}
	for(i=low;i<=high;i++)
	{
		a[i]=b[i];
	}
}
