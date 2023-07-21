package in.srkr.dsa1.oops;

public class Interf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Motor obg=new Cycle();
		obg.steering();
		obg.brakes();
		obg.gears();
	}

}
interface Motor
{
	 void steering();
	 void brakes();
	 void gears();
	default void show()
	{
		System.out.println("hi");
	}
}
class Cycle implements Motor
{
	@Override
	public void steering()
	{
		System.out.println("turn left");
	}
	@Override
	public void brakes()
	{
		System.out.println("apply break");
	}
	@Override
	public void gears()
	{
		System.out.println("1st gear");
	}
}