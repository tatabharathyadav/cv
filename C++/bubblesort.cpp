 #include<iostream>
 using namespace std;
 template<class T>
 T bubblesort(T a[])
 {
 	for(T i=0;i<5;i++)
 	{
 		for(T j=0;j<5;j++)
 		{
 			if(a[j]>a[j+1])
 			{
 				T temp;
 				temp=a[j];
 				a[j]=a[j+1];
 				a[j+1]=temp;
			 }
		 }
	 }
	 for(int i=0;i<5;i++)
	 {
	 	cout<<a[i];
	 }
 }
 int main()
 {
 	int arr[5]={1,4,2,3};
 	bubblesort(arr);
 }
