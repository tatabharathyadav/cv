class Handle
{
 public static void main(String args[])
 {
   try
   {
    int a[]={1,2,3,4,5};
    a[10]=50;
    throw new ArrayIndexOutOfBoundsException("This is ArrayIndexOutOfBoundsException");
   }
   catch(Exception e)
   {
     System.out.println(e);
   }
   finally
   {
     System.out.println("Thank u andi");
   }
 }
}