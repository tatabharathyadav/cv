package in.srkr.dsa1.oops3;

public class TestAggregation {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
       Address address=new Address();
       address.setLane("lanel");
       address.setCity("bapatla");
       address.setState("AP");
       address.setCountry("India");
       
       Employee employee=new Employee();
       employee.setId(10001);
       employee.setFirstName("bharath");
       employee.setLastName("vijay");
       employee.setAge(47);
       employee.setAddress(address);
	
}
}
