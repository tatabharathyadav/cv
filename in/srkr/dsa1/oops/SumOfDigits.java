package in.srkr.dsa1.oops;
import java.util.Scanner;
public class SumOfDigits {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int r=0;
		int sum=0;
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		int n=sc.nextInt();
		while(n>0)
		{
			r=n%10;
			sum=sum+r;
			count++;
			n=n/10;
		}
		System.out.println("sum="+sum);
		System.out.println("count="+count);
		
	}

}
