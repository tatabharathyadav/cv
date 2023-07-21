package in.collections;
import java.util.*;
public class LLPrac {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(100);
		al.add(102);
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.addAll(al);
		//ll.clear();
		ll.removeAll(al);
		ll.set(0, 99);
		System.out.println(ll);
		System.out.println(ll.get(1));
		System.out.println(ll.contains(3));
		//Collections.synchronizedList(ll);
		for(int s:ll)
		{
			System.out.println(s);
		}
	}

}
