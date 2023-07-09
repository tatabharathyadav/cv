package in.srkr.dsa1.oops;

import java.util.Arrays;

public class Assi4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library obj2=new Library();
		obj2.display();
		Book obj=new Book();
		obj.addBooks();
		Members obj1=new Members();
		obj1.lendBooks();
	}

}
class Book
{
	public void addBooks()
	{ 
		String[] arr=new String[5];
		arr[0]="co";
		arr[1]="daa";
		arr[2]="java";
		for(int i=0;i<arr.length;i++)
		{
		System.out.println(arr[i]);
		}
		System.out.println("currently available books are:"+Arrays.toString(arr));
		int num=3;
		String a="ds";
		String b="mp";
		arr[num++]=a;
		arr[num++]=b;
		for(int i=0;i<arr.length;i++)
		{
		System.out.println(arr[i]);
		}
		System.out.println("after adding total books are "+Arrays.toString(arr));
	}
}
class Members
{
	public void lendBooks()
	{ 
		String[] arr=new String[5];
		arr[0]="co";
		arr[1]="daa";
		arr[2]="java";
		arr[3]="che";
		arr[4]="phy";
		for(int i=0;i<arr.length;i++)
		{
		System.out.println(arr[i]);
		}
		System.out.println("currently available books are:"+Arrays.toString(arr));
		int num=4;
		String a="null";
		String b="null";
		arr[num--]=a;
		arr[num--]=b;
		for(int i=0;i<arr.length;i++)
		{
		System.out.println(arr[i]);
		}
		System.out.println("after lending total books are "+Arrays.toString(arr));
	}
}
class Library
{
	public void display()
	{
		String[] arr=new String[7];
		arr[0]="co";
		arr[1]="daa";
		arr[2]="java";
		arr[3]="che";
		arr[4]="phy";
		arr[5]="ds";
		arr[6]="mp";
		for(int i=0;i<arr.length;i++)
		{
		System.out.println(arr[i]);
		}
		System.out.println("total available books are:"+Arrays.toString(arr));
	}
}
