package in.srkr.dsa1.oops;
import java.util.Scanner;
public class Assi11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product obj=new Product();
		obj.value();
	}

}
class Product
{
	int productNo;
	float price;
	int quantity;
	float value;
	int n;
	int num;
	float sum=0;
	public void value()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number of products:");
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.print("enter product number:");
			productNo=sc.nextInt();
			System.out.print("enter product price:");
			price=sc.nextFloat();
			System.out.print("enter quantity:");
			quantity=sc.nextInt();
			float value=price*quantity;
			System.out.println("value of  product is:"+value);
			 sum=sum+value;
		}
		System.out.println("Total value of products is:"+sum);
	}
}