package in.srkr.dsa1.access;

import java.util.*;

public class Hash 
{
    public static void main(String[] args)
    {
    	 HashSet hash=new HashSet();
    	 hash.add("abc");
    	 hash.add("xyz");
    	 hash.add("abc");
    	 hash.add(null);
    	 hash.add(null);
    	 System.out.println(hash);
	}
}