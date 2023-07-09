package in.srkr.dsa1.oops;
import java.util.Scanner;
public class Assi1 
{
	public static void main(String[] args)
	{
		Car obj=new Car();
		obj.get();
		obj.set();
		obj.depreciation();
	}
}
	class Car
	{
		String make;
		String model;
		int year;
		float price;
		long deprecient;
		float temp;
		int noofyears=3;
		public void get()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter car make,model,year,price respectively:");
			make=sc.nextLine();
			model=sc.nextLine();
			year=sc.nextInt();
			price=sc.nextFloat();
		}
		public void set()
		{
			System.out.println(make);
			System.out.println(model);
			System.out.println(year);
			System.out.println(price);
		}
		public void depreciation()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter depreciation percentage");
			deprecient=sc.nextLong();
			temp=price;
			for(int i=0;i<noofyears;i++)
			temp=((100-deprecient)*temp)/100;
			System.out.println("after depreciation = "+temp);
			
		}
}
