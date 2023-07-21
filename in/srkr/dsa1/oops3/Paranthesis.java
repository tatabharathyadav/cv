package in.srkr.dsa1.oops3;
import java.util.*;
public class Paranthesis {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		  

	}

}
class StringReversal
{
    public static String reverseStringIterative(String input)
    {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
 }
}