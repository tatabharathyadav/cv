import java.io.*;
import java.util.Scanner;
import java.lang.Math;
class Roots
{
 static int a,b,c;
 static double d,r1,r2,r3;
 public static void main(String args[])
 {
  Scanner obj=new Scanner(System.in);
  System.out.println("enter a value");
  int a=obj.nextInt();
  System.out.println("enter b value");
  int b=obj.nextInt();
  System.out.println("enter c value");
  int c=obj.nextInt();
  d=b*b-4*a*c;
  if (d>0.0)
  {
   r1=(-b+Math.sqrt(d))/2*a;
   r2=(-b-Math.sqrt(d))/2*a;
   System.out.println("roots are real");
   System.out.println("roots are"+r1+"and"+r2);
  }
  else if(d==0.0)
  {
   r3=-b/2*a;
   System.out.println("roots are equal"+r3);
  }
  else
  {
   System.out.println("roots are imaginary");
  }
 }
}