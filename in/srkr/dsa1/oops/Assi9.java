package in.srkr.dsa1.oops;
import java.util.Scanner;
public class Assi9 
{
	public static void main(String args[])
	{
		Bank obj=new Bank();
		obj.addAccount();
		obj.removeAccount();
	}
}
class Bank
{
	String name;
	int age;
	long phoneNo;
	int password;
	float amount;
	public void addAccount()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name:");
		name=sc.nextLine();
		System.out.println("enter age:");
		age=sc.nextInt();
		System.out.println("enter phone number:");
		phoneNo=sc.nextLong();
		System.out.println("enter password:");
		password=sc.nextInt();
		System.out.println("deposite amount to start:");
		amount=sc.nextFloat();
		System.out.println("Account created Successfully");
	}
	public void removeAccount()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name:");
		name=sc.nextLine();
		System.out.println("enter password:");
		password=sc.nextInt();
		System.out.println("Account removed Successfully");
	}
}