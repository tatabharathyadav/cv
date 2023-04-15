class A
{
  A()
  {
    System.out.println("hello");
  }
}
class B1 extends A
{
 B1()
 {
   super();
 }
 public static void main(String arg[])
 {
   B1 obj=new B1();
 }
}