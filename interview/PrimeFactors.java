package in.interview;

public class PrimeFactors 
{
	public static void main(String[] args) {
		int a=24;
		for(int i=2;i<a;i++)
		{
			while(a%i==0)
			{
				System.out.println(i);
				a=a/i;
			}
		}
		if(a >2) {
	         System.out.println(a);
	      }
	}

}
