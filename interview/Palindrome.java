package in.interview;
	class Solution
	{
	    public  void isPalindrome(int x) 
			{
				int y=x;
				int rev=0;
				while(y>0)
				{
					int di=y%10;
					rev=rev*10+di;
					y=y/10;
				}
				if(x==rev)
				{
					System.out.println("palindrome number");
				}
				else
				{
					System.out.println("not a palindrome number");
				}
	        
	    }
	}

public class Palindrome 
{
	public static void main(String[] args)
	{
		Solution obj=new Solution();
		obj.isPalindrome(101);
	}
}
