public class Moverloading 
{
    public static void main(String args[])
    {
        Employee obj3=new Employee();
        obj3.getdata();
        Employee obj1=new Employee(2);
        obj1.getdata();
        Employee obj2=new Employee(2,"bharath");
        obj2.show();
    }
}
class Employee
{
    int empid;
    String first;
    String last;
    String dept;
    Employee()
    {
        System.out.println("hi");
    }
    Employee(int empid)
    {
        this.empid=empid;
    }

    void getdata()
    {
         System.out.println(empid);
    }
    Employee(int empid,String first)
    {
        this.empid=empid;
        this.first=first;
    }
    void show()
    {
         System.out.print(empid);
         System.out.println(first);
    }
}