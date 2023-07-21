package in.srkr.dsa1.oops;
import java.util.Scanner;
public class A 
{
	public static void main(String[] args)
	{
		 B obj=new B();
		 obj.name();
	}
}
class B
{
    int a=10;
    String b;
    String c;
    public void name()
    {
    	System.out.println("enter b and c:");
    	Scanner sc=new Scanner(System.in);
        b=sc.nextLine();
    	c=sc.nextLine();
    	System.out.println(a);
    	System.out.println(b);
    	System.out.println(c);
        System.err.println("hi");
    }
}