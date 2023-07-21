package in.srkr.dsa1.access;

public class CursorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			B b1=new B();
			System.out.println(b1);
	}

}
class B
{
	int a=10;
	int b=20;
	public String toString()
	{
		return ""+a+b;
	}
}