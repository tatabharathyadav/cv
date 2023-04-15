class display
{
  public void dis(int a,int b)
  { 
    System.out.println("a "+a+"b "+b);
  }
}
public class A
{
 public static void main(String args[])
 {
   display obj=new display();
   obj.dis(10,20);
 }
}