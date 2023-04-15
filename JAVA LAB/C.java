class Constructor
{
  Constructor()
  {
    System.out.println("this is 1st constructor");
  }
  Constructor(int a,int b)
  {
   System.out.println("this is 2nd constructor a and b is "+a+b);
  }
}
class C
{
  public static void main(String args[])
  {
    Constructor obj1=new Constructor();
     Constructor obj2=new Constructor(10,20);
  }
}