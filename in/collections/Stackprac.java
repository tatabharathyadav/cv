package in.collections;
import java.util.Stack;
public class Stackprac {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Stack<String> books=new Stack<>();
		books.push("red");
		books.push("blue");
		books.push("orange");
		books.push("pink");
		books.pop();
		System.out.println(books);
		System.out.println(books.contains("pink"));
		System.out.println(books.search("red"));
		System.out.println(books.indexOf("red"));
	}

}
