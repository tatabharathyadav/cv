class Car
{
  public void get()
  { 
    int a=10;
    System.out.println("a is "+a);
  }
}
class bmw extends Car
{
 public void get2()
  { 
    int a=20;
    System.out.println("a is "+a);
  }
 public static void main(String args[])
 {
   bmw obj=new bmw();
   obj.get();
   obj.get2();
 }
} 