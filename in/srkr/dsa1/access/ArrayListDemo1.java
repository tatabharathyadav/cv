package in.srkr.dsa1.access;
import java.util.ArrayList;
public class ArrayListDemo1 {
	public static void main(String[] args) {
		ArrayList<Employee> al=new ArrayList();
		al.add(new Employee(1,"jay","it"));
		for(Employee e:al)
		{
			System.out.println(e);
		}
	}
}
class Employee
{
	int id;
	String name;
	String branch;
	Employee(int id,String name,String branch)
	{
	this.id=id;
	this.name=name;
	this.branch=branch;
	}
}