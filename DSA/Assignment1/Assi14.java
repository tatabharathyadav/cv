package in.srkr.dsa1.oops;
import java.util.Scanner;
public class Assi14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User obj1=new User();
		obj1.userDetails();
		Post obj2=new Post();
		obj2.posted();
		Comment obj3=new Comment();
	    obj3.commentAdded();
	}

}
class User
{
	public void userDetails()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter name:");
	String name=sc.nextLine();
	System.out.println(name);
	System.out.println("enter password:");
	int pass=sc.nextInt();
	System.out.println(pass);
	
	}
}
class Post
{
	public void posted()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter post:");
		String name=sc.nextLine();
		System.out.println("post entered");
		System.out.println("THANK YOU");
	}
}
class Comment
{ 
	public void commentAdded()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter comment:");
	String name=sc.nextLine();
	System.out.println("comment added");
	System.out.println("THANK YOU");
	}
}