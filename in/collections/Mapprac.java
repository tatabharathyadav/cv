package in.collections;
import java.util.*;
public class Mapprac {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Map <Integer,String> m=new LinkedHashMap();
		m.put(1000, "bharath");
		m.put(1001, "charan");
		System.out.println(m);
		Set <Integer> keys=m.keySet();
		for(Integer key:keys)
		{
			System.out.println(key);
		}
		Collection<String> values=m.values();
	    for(String value:values)
	    {
	    	System.out.println(value);
	    }
		System.out.println(m.get(1000));
		System.out.println(m.containsKey(1001));
		System.out.println(m.containsValue("charan"));
		//System.out.println(m.remove(1000));
		System.out.println(m);
		m.put(1001, "spy");
		System.out.println(m);
		m.putIfAbsent(1001,"musta");
		System.out.println(m);
		m.replace(1000, "yadav");
		System.out.println(m);
		
		
	}

}
