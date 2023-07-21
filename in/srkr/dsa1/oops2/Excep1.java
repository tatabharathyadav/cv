package in.srkr.dsa1.oops2;
public class Excep1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[1];
		try
		{
			System.out.println("hello");
			System.out.println("hello");
			System.out.println("hello");
			System.out.println(a[2]);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}
}