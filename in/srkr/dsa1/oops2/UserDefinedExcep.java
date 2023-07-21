package in.srkr.dsa1.oops2;

public class UserDefinedExcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int balance=1000;
		try
		{
			if(balance<5000)
			{
				throw new LowBalanceException("Balance is low");
			}
		}
		catch(LowBalanceException e)
		{
			System.out.println(e);
		}
	}

}
class LowBalanceException extends Exception
{
	String message;
	public LowBalanceException(String message)
	{
		this.message=message;
	}
	public String  toString()
	{
		return message;
	}
}