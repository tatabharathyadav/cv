package in.collections;
import java.util.*;
public class ArrayDequePrac 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayDeque<String> ad=new ArrayDeque<>();
		ad.add("banana");
		ad.addFirst("cherry");
		ad.addLast("apple");
        ad.offerFirst("kiwi");
        ad.offer("pear");
        ad.offerLast("mango");
        System.out.println(ad);
        System.out.println(ad.peek());
        System.out.println(ad.peekFirst());
        System.out.println(ad.peekLast());
        System.out.println(ad.poll());
        System.out.println(ad);
        System.out.println(ad.pollFirst());
        System.out.println(ad);
        System.out.println(ad.pollLast());
        System.out.println(ad);
	}

}
//arraydeque is 2 way we can inser and delete at both  at head and at tail