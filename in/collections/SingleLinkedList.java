package in.collections;
class A
{
	public Node head;
	public static class Node
	{
		public int data;
		public Node next;
		Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	/**
	 * Insert a node to the given linked list
	 * this method will insert at head if the list is empty
	 * or else,it will insert at last
	 * 
	 */
	
	public static void insert(A list,int data)
	{
		Node node=new Node(data);
		node.next=null;
		//if the linked list is empty,then make the new node as head.
		if(list.head==null)
		{
			list.head=node;
		}
		//else traverse the list till the last node and insert at the last
		else
		{
			Node last=list.head;
			while(last.next!=null)
			{
				last=last.next;
			}
			// insert the new node at last node
			last.next=node;
		}
	}
	/**
	 * This method will insert the new node after any given node
	 */
	public void insertAfter(Node previousNode,int dataToBeInserted)
	{
		if(previousNode==null)
		{
			System.out.println("the given previous node cant be null");
			return;
		}
		Node newNode=new Node(dataToBeInserted);
		newNode.next=previousNode.next;
		previousNode.next=newNode;
	}
	/**
	 * Delete a node by given data at the node
	 */
	public void deleteByKey(A list,int data)
	{
		System.out.println("trying to delete node with data:"+data);
		//store head node
		Node currentNode=list.head;
		Node prev=null;
		if(currentNode!=null)
		{
			if(currentNode.data==data)
			{
				list.head=currentNode.next;
				System.out.println("element"+data+"has been deleted");
			}
			else
			{
				while(currentNode!=null && currentNode.data!=data)
				{
					prev=currentNode;
					currentNode=currentNode.next;
				}
				if(currentNode!=null)
				{
					prev.next=currentNode.next;
					System.out.println("element"+data+"has been deleted");
				}
				else
				{
					System.out.println("no node found with data:"+data);
				}
			}
		}
	}
	
	/**
	 * delete a node by given position
	 */
	public void deleteAtPosition(A list,int pos)
	{
		System.out.println("trying to delete node at position:"+pos);
		Node currentNode=list.head;
		Node prev=null;
		int counter=0;
		if(currentNode!=null)
		{
			if(pos==0)
			{
				list.head=currentNode.next;
				System.out.println("element at position"+pos+"has been deleted");
			}
			else
			{
				//count for the pos to be deleted
				//keep track of the prevoius node as it is needed to change
				while(currentNode!=null)
				{
					if(counter==pos)
					{
						prev.next=currentNode.next;
						System.out.println("element at"+pos+"has been deleted");
						break;
					}
					else
					{
						prev=currentNode;
						currentNode=currentNode.next;
					}
				}
			}
			if(pos>counter)
			{
				System.out.println("no node found at position:"+pos+"as it is greater than the size of the list");
				
			}
		}
	}
		/**
		 * RECURSIVE SEARCHING
		 * find a node with given data in the linkedlist
		 * @return-boolean value(true/false)
		 */
		public boolean search(Node head,int data)
		{
			if(head==null)
			{
				return false;
			}
			if(head.data==data)
			{
				return true;
			}
			return false;
		}
		/**
		 * return the size of the list
		 * 
		 */
		public int size(A list)
		{
			int count=0;
			Node currNode=list.head;
			while(currNode !=null)
			{
				count++;
				currNode=currNode.next;
			}
			return count;
		}
}
public class SingleLinkedList
{
	public static void main(String[] args) {
		
	A list=new A();
	list.insert(list, 100);
	list.insert(list, 101);
	list.insert(list,102);
	list.insert(list,103);
	list.traverse(list);
	list.deleteAtPosition(list,0);
	list.traverse(list);
	Node node1=list.head.next;
	list.insertA fter(node1,106);
	list.traverse(list);
	
	}
	
}











