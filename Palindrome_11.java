package in.introduction;
import java.util.*;
public class Palindrome_11 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter string: ");
	        String s = sc.nextLine();

	        String rev = new StringBuilder(s).reverse().toString();

	        System.out.println(s.equals(rev) ? "Palindrome" : "Not Palindrome");
	        sc.close();
	}

}
