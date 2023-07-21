package in.srkr.dsa1.oops;
import java.util.Scanner;
public class Assi8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Ca obj=new Ca ();
        obj.c();
        Vehicle obj1=new Vehicle();
        obj1.info();
	}

}
class Ca
{
	public void c()
	{
		float miliage;
		float noOfKm;
		float noOfLitersPetrolConsumed;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of km:");
		noOfKm=sc.nextFloat();
		System.out.println("enter number of liters of petrol consumed:");
		noOfLitersPetrolConsumed=sc.nextFloat();
		miliage=noOfKm/noOfLitersPetrolConsumed;
		float efficiency=miliage*10;
		System.out.println("efficiency:"+efficiency);
		if(miliage>10)
		{
			System.out.println("efficient");
		}
		else
		{
			System.out.println("not an efficient");
		}
	}
}
class Vehicle
{
	public void info()
	{
		System.out.println("shift,2013 model,500000/-");
	}
}