public class Inherit
{
   public static void main(String args[])
   {
        B obj=new B();
        obj.get();
        obj.show();
   }
}
class A
{
    int i=10;
    void get()
    {
    System.out.println(i);
    }
}
class B extends A
{
    int j=20;
    void show()
    {
     System.out.println(j);
    }
}