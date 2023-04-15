import java.util.Scanner;
class Mergesort
{
  public static void main(String args[])
  {
    int n1,n2,i,j,k;
    int a[]=new int[20];
    int b[]=new int[20];
    int c[]=new int[20];
    Scanner s=new Scanner(System.in);
    System.out.println("enter number of elements in 1st array");
    n1=s.nextInt();
    System.out.println("enter sorted elements of 1st array");
    for(i=0;i<n1;i++)
    { 
      a[i]=s.nextInt();
    }
    System.out.println("enter number of elements in 2nd array");
    n2=s.nextInt();
    System.out.println("enter sorted elements of 2nd array");
    for(j=0;j<n2;j++)
    { 
      b[j]=s.nextInt();
    }
    i=0;
    j=0;
    k=0;
    while((i<n1) &&(j<n2))
    {
      if(a[i]>b[j])
      {
        c[k++]=b[j++];
      }
      else
      {
        c[k++]=a[i++];
      }
    }
    while(i<n1)
    {  
      c[k++]=a[i++];
    }
    while(j<n2)
    {  
      c[k++]=b[j++];
    }
    System.out.println("enter merging elements are");
    for(i=0;i<(n1+n2);i++)
    { 
      System.out.println("\t"+c[i]);
    }
  }
}