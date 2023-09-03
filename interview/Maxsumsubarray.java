package in.interview;
public class Maxsumsubarray
{
	public static void main(String[] args)
	{
		int a[]= {-2,-3,4,-1,-2,1,5,-3};
		int sum = 0;
		int max=a[0];
		for(int i=0;i<8;i++)
		{
			sum=sum+a[i];
			if(max<sum)
			{
				max=sum;
			}
		    if(sum<0)
			{
				sum=0;
			}
			}
		System.out.println(max);
	}
}
