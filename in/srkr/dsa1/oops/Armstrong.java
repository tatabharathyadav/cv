package in.srkr.dsa1.oops;
import java.util.*;
public class Armstrong {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int count=0;
		int r=0;
		double sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		int temp=n;
		while(temp>0)
		{
			temp=temp/10;
			count++;
		}
		temp=n;
		while(temp>0)
		{
			r=temp%10;
			sum=sum+(Math.pow(r,count));
			temp=temp/10;
		}
		if(sum==n)
		{
			System.out.println("armstrong number");
		}
		else
		{
			System.out.println("not an armstrong number");
		}
	}
}
