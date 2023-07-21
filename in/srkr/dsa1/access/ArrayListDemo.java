package in.srkr.dsa1.access;
import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList();
		al.add("abc");
		al.add("xyz");
		al.add("abc");
		al.add(null);
		al.add(null);
		al.add(100);
		al.add(true);
		al.add(10.20);
		
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			System.out.println(al);
		}
		
	}

}
