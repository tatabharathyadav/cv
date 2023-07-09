package in.srkr.dsa1.oops;
import java.util.Scanner;
public class Assi5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj=new Employee();
		obj.bonus();
	}

}
class Employee
{
	String name;
	long empId;
	float salary;
	float bonus;
	int noOfYears;
	public void bonus()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name,id,salary,bonus,number of years of an employee");
		name=sc.nextLine();
		empId=sc.nextLong();
		salary=sc.nextFloat();
		bonus=sc.nextFloat();
		noOfYears=sc.nextInt();
		salary=salary+((bonus*10)*noOfYears);
		System.out.println("salary after adding bonous is:"+salary);
	}
	
}