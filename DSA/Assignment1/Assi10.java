package in.srkr.dsa1.oops;
import java.util.Scanner;
public class Assi10 {

	public static void main(String[] args) {
        Ticket obj3=new Ticket();
        obj3.cost();
        Movie obj1=new Movie();
        obj1.booking();
        Theater obj2=new Theater();
        obj2.seating();
	}

}
class Movie
{
	public void booking()
	{
		System.out.println("click on pay amount");
		System.out.println("Ticket booked Successfully");
	}
}
class Theater
{
	public void seating()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter seat number:");
	int number=sc.nextInt();
	if(number<=10)
	{
		System.out.println("sit in first row");
		System.out.println("THANK YOU");
	}
	else if(20<=number && number>10)
	{
		System.out.println("sit in second row");
		System.out.println("THANK YOU");
	}
	else if(30<=number && number>20)
	{
		System.out.println("sit in third row");
		System.out.println("THANK YOU");
	}
	else
	{
		System.out.println("sit in balcony");
		System.out.println("THANK YOU");
	}
	}
}
class Ticket
{
	public void cost()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter cinema name:");
		String name=sc.nextLine();
	
		System.out.println("enter seating name:");
		String seatingName=sc.nextLine();
		String balcony=seatingName;
		String maharaj=seatingName;
		if(seatingName == balcony)
		{
			System.out.println("ticket price is 200/-");
		}
		else if(seatingName == maharaj)
		{
			System.out.println("ticket price is 150/-");
		}
		else
		{
			System.out.println("ticket price is 100/-");
		}
	}
}