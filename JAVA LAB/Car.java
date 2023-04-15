class Car
{
  float price;
  public void get()
  {
    System.out.println("my car price is 20L");
  }
}
class bmw extends Car
{
 public static void main(String args[])
 {
   bmw obj=new bmw();
   obj.get();
 }
} 