package in.srkr.dsa1.oops;
import java.util.Scanner;
public class Assi3 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		BankAccount obj=new BankAccount();
		obj.deposite();
        obj.withdraw();
	}

}
class BankAccount
{
	long accountNumber;
	String holderName;
	long balance;
	long actualAmount=50;
	public void deposite()
	{
		System.out.print("enter amount to be deposite:");
		Scanner sc=new Scanner(System.in);
		long amount=sc.nextLong();
		actualAmount=actualAmount+amount;
		System.out.println("your account has:"+actualAmount+" "+"rupees");
	}
	public void withdraw()
	{
		System.out.print("enter amount to be withdraw:");
		Scanner sc=new Scanner(System.in);
		long withdrawAmount=sc.nextLong();
		actualAmount=actualAmount-withdrawAmount;
		System.out.println("your account has:"+actualAmount+" "+"rupees");
	}
	
}