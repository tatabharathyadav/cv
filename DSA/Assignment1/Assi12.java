package in.srkr.dsa1.oops;
import java.util.Scanner;
public class Assi12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV obj=new TV();
		Mobile obj2=new Mobile();
		Laptop obj3=new Laptop();
		obj.swith();
		obj3.brightness();
		obj2.volume();
	}

}
class TV
{
	public void swith()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter whether u want to swith on or off");
		String n=sc.nextLine();
		String on=n;
		String off=n;
		if(n==on)
		{
			System.out.println("switch onned");
		}
		else
		{
			System.out.println("switch offed");
		}
	}
}
class Mobile
{
	public void volume()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter whether u want to volume increase or derease");
		String n=sc.nextLine();
		String increase=n;
		String decrease=n;
		if(n==increase)
		{
			System.out.println("volume increased");
		}
		else
		{
			System.out.println("volume decreased");
		}
	}
}
class Laptop
{
	public void brightness()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter whether u want to brightness increase or derease");
		String n=sc.nextLine();
		String increase=n;
		String decrease=n;
		if(n==increase)
		{
			System.out.println("brightness increased");
		}
		else
		{
			System.out.println("brightness decreased");
		}
	}
}