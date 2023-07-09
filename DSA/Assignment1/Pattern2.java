package in.srkr.dsa1.oops;

public class Pattern2 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		pattern4(4);
	}
	static void pattern(int n)
	{
		for(int row=1;row<=n;row++)
		{
			for(int col=1;col<=n;col++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
		static void pattern3(int n)
		{
			for(int row=1;row<=n;row++)
			{
				for(int col=1;col<=n+1-row;col++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
		}
		static void pattern4(int n)
		{
			for(int row=1;row<=n;row++)
			{
				for(int col=1;col<=row;col++)
				{
					System.out.print(col);
				}
				System.out.println();
			}
		}
	
}

