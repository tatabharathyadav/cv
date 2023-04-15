import java.util.Scanner;
class BinarySearch
{
  public static void main(String args[])
  {
    int num,n,i,first,last,middle;
    int a[]=new int[20];
    Scanner s=new Scanner(System.in);
    System.out.println("enter number of elements");
    n=s.nextInt();
    System.out.println("enter elements in sorted order");
    for(i=0;i<n;i++)
    {
       a[i]=s.nextInt();
    }
    System.out.println("enter the search value");
    num=s.nextInt();
    first=0;
    last=n-1;
    middle=(first+last)/2;
    while(first<=last)
    {
      if(a[middle]<num)
      {
         first=middle+1;
      }
      else if(a[middle]==num)
      {
         System.out.println("element found");
         break;
      }
      else
      {
        last=middle-1;
      }
      middle=(first+last)/2;
    }
   if(first>last)
   {
      System.out.println("number not found");
   }
 }
}