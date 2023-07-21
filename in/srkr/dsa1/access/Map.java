package in.srkr.dsa1.access;
import java.util.*;
public class Map 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		HashMap map=new HashMap();
		map.put(0,"vijay");
		map.put(1,"abc");
		map.put(2,"xyz");
		map.put(3,"asd");
		map.put(4,"zxc");
		map.put(0,null);
		map.put(null,"iop");
		map.put(null,null);
		System.out.println(map);		
	}
}
