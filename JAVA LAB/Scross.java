abstract class Car
{
 abstract void display();
}
class Scross extends Car
{
 void display()
 {
   System.out.println("drive safely");
 }
 public static void main(String args[])
 {
   Scross obj=new Scross();
   obj.display();
 }
}
