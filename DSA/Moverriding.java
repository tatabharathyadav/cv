public class Moverriding
{
   public static void main(String args[])
   {
       B a=new B();
       a.get(10);
   }
}
class A 
{
    void get(int i)
    {
        System.out.println(i);
    }
}
class B extends A
{
    void get(int i)
    {
        super.get(i);
        System.out.println("hi");
    }
}