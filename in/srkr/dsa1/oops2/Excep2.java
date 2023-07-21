package in.srkr.dsa1.oops2;

public class Excep2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1= new A();
		try
		{
			a1.m2();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class A
{
	void m1() throws Exception
	{
		System.out.println(2/0);
	}
	void m2() throws Exception
	{
		m1();
	}
}