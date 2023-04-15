class Bharath
{ 
 static int a=10;
 static int b=20;
 public void add()
 {
    System.out.print(a+b);
 }
 public static void main(String args[])
 {
   System.out.println("hi");
   Bharath obj=new Bharath();
   System.out.print(a+b);
   obj.add();
 }
}