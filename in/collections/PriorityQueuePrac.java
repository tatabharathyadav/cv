package in.collections;
import java.util.*;
public class PriorityQueuePrac {

	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		//generally default value of an object is null
		pq.offer(3);
		pq.offer(2);
		pq.add(4);
		pq.add(5);
		pq.add(1);
		System.out.println(pq);
		//in this 1 has highest priority so it is in head(1st) position remaining are at random positions
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.remove());
        System.out.println(pq);
        System.out.println(pq.contains(5));
        while(!pq.isEmpty())//if we use foreach loop elts are not come as order
        {
        	System.out.println(pq.poll());
        }
        //pq.clear();
        PriorityQueue<Integer> pq1=new PriorityQueue<>(Comparator.reverseOrder());
		//generally default value of an object is null
		pq1.offer(3);
		pq1.offer(2);
		pq1.add(4);
		pq1.add(5);
		pq1.add(1);
		System.out.println(pq1);
		//in this 1 has highest priority so it is in head(1st) position remaining are at random positions
        System.out.println(pq1.peek());
        System.out.println(pq1.poll());
        System.out.println(pq1);
        System.out.println(pq1.remove());
        System.out.println(pq1);
        System.out.println(pq1.contains(5));
        while(!pq1.isEmpty())//if we use foreach loop elts are not come as order
        {
        	System.out.println(pq1.poll());
        }
	}

}
//priority queue is one way wcan insert and delete at only head position 
//arraydeque is 2 way we can inser and delete at both  at head and at tail
