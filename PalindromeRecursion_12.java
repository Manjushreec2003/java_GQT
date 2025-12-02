package in.operators;
import java.util.*;
public class PalindromeRecursion_12 {
	static String reverse(String s) {
        if(s.length() <= 1) return s;
        return reverse(s.substring(1)) + s.charAt(0);
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        String rev = reverse(s);
        System.out.println(s.equals(rev) ? "Palindrome" : "Not Palindrome");
        sc.close();

	}

}
