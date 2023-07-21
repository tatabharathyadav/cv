package in.collections;
import java.util.*;
public class ArrlistPrac {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList<String> v1=new ArrayList();
		v1.add("ramesh");
		v1.add("suresh");
		System.out.println(v1);
		Vector v2=new Vector();
		v2.add("ram");
		v2.add("su");
		v1.addAll(v2);
		System.out.println(v1);
		v1.remove("ramesh");
		System.out.println(v1);
		System.out.println(v1.contains("ram"));
		System.out.println(v1.containsAll(v2));
	    System.out.println(v1.get(0));
	    v1.set(0,"satish");
	    System.out.println(v1);
		System.out.println(v1.size());
		//System.out.println(v1.capacity());
		

	}

}
