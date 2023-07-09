package in.srkr.dsa1.oops;
import java.util.Scanner;
public class Assi7 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
      Stud obj=new Stud();
      obj.average();
	}
}
class Stud
{
	String name;
	int rollNo;
	int grade;
	int sum=0;
	double avg;
	public void average()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of students for grades");
		int n=sc.nextInt();
		int arr[]=new int[10];
		System.out.println("enter the grades");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Grades are:");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		for(int i=0;i<n;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("Grades average is :");
		System.out.println(sum);
		avg=sum/n;
		System.out.println(avg);
	}
	}
