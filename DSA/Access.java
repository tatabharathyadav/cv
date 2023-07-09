import pack1.A;

public class Access 
{
    public static void main(String[] args)
    {
        A a=new A();
        a.get();
        A.B b=a.new B();
        b.get1();
    }
}
class A
{
    int a=20;
    void get()
    {
        System.out.println(a);
    }
    class B
    {
        int b=10;
        void get1()
        {
            System.out.println(b);
        }
    }
}