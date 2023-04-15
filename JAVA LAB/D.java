class Methods
{
  public void display()
  {
    System.out.println("this is 1st method");
  }
  public void display(int a,int b)
  {
   System.out.println("this is 2nd method a and b is "+a +b);
  }
}
class D
{
  public static void main(String args[])
  {
    Methods obj=new Methods();
    obj.display();
    obj.display(10,20);
  }
}