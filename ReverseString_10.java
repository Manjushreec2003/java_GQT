package in.introduction;
import java.util.*;

public class ReverseString_10 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter string: ");
	        String s = sc.nextLine();

	        String rev = "";
	        for(int i = s.length()-1; i >= 0; i--)
	            rev += s.charAt(i);

	        System.out.println("Reversed: " + rev);
	        sc.close();
	}

}
