package in.srkr.dsa1.oops;

import java.util.Scanner;
import java.util.Arrays;
public class Assi15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Restaurant obj=new Restaurant();
		obj.rest();
	}

}
class Restaurant
{
	String name;
	String menuItems;
	int customerRating;
	int sum=0;
	float avg;
	public void rest()
	{
		String arr[]=new String[5];
		arr[0]="chicken";
		arr[1]="mutton";
		arr[2]="fish";
		System.out.println("Menu items are:"+Arrays.toString(arr));
		int n=3;
		String a="peetha";
		String b="pig";
		arr[n++]=a;
		arr[n++]=b;
		System.out.println("Menu items after adding new items are:"+Arrays.toString(arr));
		int arr1[]=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of people that are giving rating:");
		int n1=sc.nextInt();
		for(int i=0;i<n1;i++)
		{
			System.out.println("enter the RATING");
			arr1[i]=sc.nextInt();
			sum=sum+arr1[i];
		}
		//System.out.println("sum is :");
		//System.out.println(sum);
		avg=sum/n1;
		System.out.println("average rating is :");
		System.out.println(avg);
	}
}