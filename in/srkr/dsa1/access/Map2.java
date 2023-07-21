package in.srkr.dsa1.access;
import java.util.*;
public class Map2
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		TreeMap map=new TreeMap();
		map.put(0,"vijay");
		map.put(1,"abc");
		map.put(2,"xyz");
		map.put(3,"asd");
		map.put(4,"zxc");
		map.put(0,null);
		//map.put(null,"iop");
		//map.put(null,null); in treemap key cant be null
		System.out.println(map);		
	}
}
