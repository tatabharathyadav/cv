package in.srkr.dsa1.oops;

import java.util.Arrays;

public class Assi6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Animal obj=new Animal();
       obj.feed();
       ZooKeeper obj1=new ZooKeeper();
       obj1.add();
       Zoo obj2=new Zoo();
       obj2.display();
	}
}
class Animal
{
	public void feed()
	{
		String animals[]= {"tiger","cat","dog"};
		String food[]= {"meat","milk","rice"};
		//animals=food;
		
		for(int i=0;i<animals.length;i++)
		{
		System.out.println(animals[i]);
		}
		for(int i=0;i<animals.length;i++)
		{
		System.out.println(food[i]);
		}
	}
}
class ZooKeeper
{
	public void add()
	{
		String animals[]=new String[5];
		animals[0]="tiger";
		animals[1]="cat";
		animals[2]="dog";
		System.out.println("Before adding animlas are:"+Arrays.toString(animals));
		int count=3;
		String a="ziraffe";
		String b="cheetha";
		animals[count++]=a;
		animals[count++]=b;
		System.out.println("After adding animals are:"+Arrays.toString(animals));
     }
}
class Zoo
{
	public void display()
	{
		String animals[]=new String[5];
		animals[0]="tiger";
		animals[1]="cat";
		animals[2]="dog";
		animals[3]="ziraffe";
		animals[4]="cheetha";
		System.out.println("Animlas present in the zoo are:"+Arrays.toString(animals));
	}
}





