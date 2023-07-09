package in.srkr.dsa1.oops;

public class Assi2
{

	public static void main(String[] args)
	{
		Hierarchy obj=new Hierarchy();
		obj.circle();
		obj.rectangle();
		obj.triangle();
	}
}
class Hierarchy
{
	public void circle()
	{
		float pi=3.14f;
		float area;
		float perimeter;
		int r=5;
		area=pi*r*r;
		System.out.println("circlr area is "+area);
		perimeter=2*pi*r;
		System.out.println("circle perimeter is "+perimeter);
	}
	public void rectangle()
	{
		int length=5;
		int breadth=3;
		float area;
		float perimeter;
		area=length*breadth;
		System.out.println("rectangle area "+area);
		perimeter=2*(length+breadth);
		System.out.println("rectangle perimeter is "+perimeter);
	}
	public void triangle()
	{
		int length=5;
		int breadth=3;
		int side=4;
		double area;
		float perimeter;
		area=0.5*length*breadth;
		System.out.println("triangle area "+area);
		perimeter=side+length+breadth;
		System.out.println("triangle perimeter is "+perimeter);
	}
}

