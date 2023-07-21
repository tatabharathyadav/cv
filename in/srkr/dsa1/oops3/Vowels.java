package in.srkr.dsa1.oops3;
import java.util.Scanner;
public class Vowels {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		    String str1,str2;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter a word:");
			 str1=sc.next();
		    str2=str1.replaceAll("[a,e,i,o,u]","");
			System.out.println(str2);
	}
	}

