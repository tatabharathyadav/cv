package in.srkr.dsa1.oops;

import java.util.Scanner;

public class Assi13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudntRecord obj=new StudntRecord();
		obj.average();
	}

}
class StudntRecord
{
	String name;
	int rollNo;
	float marks;
	int grade;
	int sum=0;
	double avg;
	public void average()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name:");
		String name=sc.nextLine();
		System.out.println("enter the roll number");
		int rollNo=sc.nextInt();
		System.out.println("enter the number of subjects");
		int n=sc.nextInt();
		int arr[]=new int[10];
		for(int i=0;i<n;i++)
		{
			System.out.println("enter the subject number");
			arr[i]=sc.nextInt();
			System.out.println("enter the marks");
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		System.out.println("sum is :");
		System.out.println(sum);
		avg=sum/n;
		System.out.println("average is :");
		System.out.println(avg);
		int arr1[]=new int[10];
		System.out.println("enter the student grades");
		for(int i=0;i<n;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("Grades are:");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr1[i]);
		}
	}
	}