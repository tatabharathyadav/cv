package in.srkr.dsa1.oops;

public class Abs1 {
	public static void main(String args[])
	{
		Truck obj=new Tata();
		obj.on();
		obj.off();
		Tata obj1=new Tata();
		obj1.carDetails();
	}
}
abstract class Truck
{
	abstract void on();
	abstract void off();
}
class Tata extends Truck
{
	void on()
	{
		System.out.println("switch on ac");
	}
	void off()
	{
		System.out.println("switch off ac");
	}
	public void carDetails()
	{
		System.out.println("shift ");
	}
}