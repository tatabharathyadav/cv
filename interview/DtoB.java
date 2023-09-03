package in.interview;

public class DtoB 
{
	public static void main(String[] args) {
		
	int decimal=11,index=0;;
	int binary[]=new int[20];
	
	while(decimal>0)
	{
		binary[index++]=decimal%2;
		decimal=decimal/2;
	}
	   for(int i = index-1;i >= 0;i--){    
	       System.out.print(binary[i]);    
	     }    
	System.out.println(); 
	}    
}
