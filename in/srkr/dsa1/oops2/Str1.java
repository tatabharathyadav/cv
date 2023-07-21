package in.srkr.dsa1.oops2;

public class Str1 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String s1=new String("abc");
		String s2=new String("abc");
		String s3="abc";
		String s4="ABC";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s3.hashCode());
		System.out.println(s4);
	}
}
