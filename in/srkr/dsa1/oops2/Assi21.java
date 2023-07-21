package in.srkr.dsa1.oops2;
import java.util.Scanner;
public class Assi21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	Scanner sc=new Scanner(System.in);
        	System.out.println("enter a and b values:");
        	int a=sc.nextInt();
        	int b=sc.nextInt();
        	int c;
        	c=a/b;
        	System.out.println(c);
        }
        catch(Exception e)
        {
        	System.out.println(e);
        }
	}
}
