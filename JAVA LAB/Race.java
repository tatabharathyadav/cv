import java.io.*;
import java.util.Scanner;
class Race
{
 static float avg;
 public static void main(String args[])
 {
   Scanner obj=new Scanner(System.in);
   System.out.println("enter a biker speed");
   int a=obj.nextInt();
   System.out.println("enter b biker speed");
   int b=obj.nextInt();
   System.out.println("enter c biker speed");
   int c=obj.nextInt();
   System.out.println("enter d biker speed");
   int d=obj.nextInt();
   System.out.println("enter e biker speed");
   int e=obj.nextInt();
   avg=(a+b+c+d+e)/5;
   System.out.println("avg speed is"+avg);
   if (a>avg)
   {
    System.out.println("a is qualified");
   }
   if (b>avg)
   {
    System.out.println("b is qualified");
   }
   if (c>avg)
   {
    System.out.println("c is qualified");
   }
   if (d>avg)
   {
    System.out.println("d is qualified");
   }
   if (e>avg)
   {
    System.out.println("e is qualified");
   }
 }
 }