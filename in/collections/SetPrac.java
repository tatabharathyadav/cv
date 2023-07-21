package in.collections;
import java.util.*;
public class SetPrac {

	public static void main(String[] args)
	{
		HashSet <Integer> a=new HashSet<>();
		a.add(2);
		a.add(3);
		a.add(7);
		a.add(5);
		a.add(2);
		a.add(7);
		System.out.println(a);
		a.remove(7);
		System.out.println(a);
		System.out.println(a.contains(3));
		for(Integer ele:a)
		{
			System.out.println(ele);
		}

		//in hash set order is in zigzag
		//in linkedhash set order is as given in code

		LinkedHashSet <Integer> ab=new LinkedHashSet<>();
		ab.add(2);
		ab.add(3);
		ab.add(7);
		ab.add(5);
		ab.add(2);
		ab.add(7);
		System.out.println(ab);
		a.remove(7);
		System.out.println(ab);
		System.out.println(ab.contains(3));
		for(Integer ele:ab)
		{
			System.out.println(ele);
		}

	}

}
