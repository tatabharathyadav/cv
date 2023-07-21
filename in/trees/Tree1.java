package in.trees;

class Node
{
	int data;
	Node left;
	Node right;
	public Node(int data)
	{
		this.data=data;
		left=null;
		right=null; 
	}
}
class Tree1 
{
   Node root;
   public Tree1()
   {
	   root=null;
   }
   public void insert(int data)
   {
	   root=insertRecursive(root,data);
   }
   private Node insertRecursive(Node current,int data)
   {
	   if(current==null)
	   {
		   return new Node(data);
	   }
	   if(data<current.data)
	   {
		   current.left=insertRecursive(current.left,data);
	   }
	   else if(data>current.data)
	   {
		   current.right=insertRecursive(current.right,data);
	   }
	   return current;
   }
   public boolean contains(int data)
   {
	   return containsRecursive(root,data);
   }
   private boolean containsRecursive(Node current ,int data)
   {
	   if(current==null)
	   {
		   return false;
	   }
	   if(data==current.data)
	   {
		   return true;
	   }
	   else if(data<current.data)
	   {
		   return containsRecursive(current.left , data);
	   }
	   else
	   {
		   return containsRecursive(current.right , data);
	   }
   }
   public void delete(int data)
   {
	   root=deleteRecursive(root,data);
   }
   private Node deleteRecursive(Node current,int data)
   {
	   if(current==null)
	   {
		   return null;
	   }
	   if(data==current.data)
	   {
		   if(current.left==null && current.right==null)
		   {
			   return null;
		   }
		   if(current.left==null)
		   {
			   return current.right;
		   }
		   if(current.right==null)
		   {
			   return current.left;
		   }
		   int smallestValue=findSmallestValue(current.right);
		   current.data=smallestValue;
		   current.right=deleteRecursive(current.right,smallestValue);
		   return current;
	   }
		   if(data<current.data)
		   {
			   current.left=deleteRecursive(current.left,data);
		   }
		   else
		   {
			   current.right=deleteRecursive(current.right,data);
		   }
		   return current;
   }
   private int findSmallestValue (Node root)
   {
	   return root.left==null?root.data:findSmallestValue(root.left);
   }
   public void inorderTraversal()
   {
	   inorderRecursive(root);
   }
   private void inorderRecursive(Node current)
   {
	   if(current!=null)
	   {
		   inorderRecursive(current.left);
		   System.out.println(current.data+" ");
		   inorderRecursive(current.right);
		   
	   }
	   
   }
   public static void main(String[] args)
   {
	   Tree1 t=new Tree1();
	   t.insert(5);
	   t.insert(3);
	   t.insert(8);
	   t.insert(1);
	   t.insert(4);
	   System.out.println(t.contains(4));
	   System.out.println(t.contains(2));
	   t.delete(3);
	   System.out.println("inorder traversal");
	   t.inorderTraversal();
   }
}
	  
   





