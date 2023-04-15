class A
{
  public void display1()
  {
    System.out.println("this is class A");
  }
}
class B extends A
{
  public void display2()
  {
    System.out.println("this is class B");
  }
}
class C1 extends B
{
 public void display3()
 {
    System.out.println("this is class D");
 }
 public static void main(String args[])
 {
   C1 obj=new C1();
   obj.display1();
   obj.display2();
   obj.display3();
 } 
}