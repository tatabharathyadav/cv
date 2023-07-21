package in.srkr.dsa1.oops3;
import java.util.Scanner;
import java.util.Arrays;
public class Anagrams {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        String str1,str2;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string1");
        str1=sc.next();
        System.out.println("enter string2");
        str2=sc.next();
        boolean areAnagrams = checkAnagrams(str1, str2);
        if (areAnagrams) {
            System.out.println("anagrams.");
        } else {
            System.out.println(" not anagrams.");
        }
        
	}
	 public static boolean checkAnagrams(String str1, String str2) {
	        str1 = str1.replaceAll("\\s", "").toLowerCase();
	        str2 = str2.replaceAll("\\s", "").toLowerCase();
	        System.out.println(str1);
	        System.out.println(str2);
	        char[] arr1 = str1.toCharArray();
	        char[] arr2 = str2.toCharArray();
	        System.out.println(arr1);
	        System.out.println(arr2);
	        Arrays.sort(arr1);
	        Arrays.sort(arr2);
	        System.out.println(arr1);
	        System.out.println(arr2);
	        return Arrays.equals(arr1, arr2);
	    }
	}



