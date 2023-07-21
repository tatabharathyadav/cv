package in.srkr.dsa1.oops2;

public class InnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer obj=new Outer();
		Outer.Inner obj1=obj.new Inner();
		obj1.m2();
	}

}
class Outer
{
	int a=10;
	void m()
	{
		System.out.println(a);
	}
	class Inner
	{
		int b=20;
		void m2()
		{
			System.out.println(b+a);
			m();
		}
	}
}