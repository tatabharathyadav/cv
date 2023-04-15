class Handling
{
  public static void main(String args[])
  {
    try
    {
      int a=1/0;
      throw new ArithmeticException("This is ArithmeticException");
    }
    catch(ArithmeticException ae)
    {
       System.out.println(ae);
    }
    //System.out.println("next statement");
    finally
    {
       System.out.println("thank u andi");
    }
  }
}