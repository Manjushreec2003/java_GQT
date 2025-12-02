package in.operators;
import java.util.*;
public class ReverseStringRecursion_17 {
	static String rev(String s) {
        if(s.length() <= 1) return s;
        return rev(s.substring(1)) + s.charAt(0);
    }

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter string: ");
	        String s = sc.nextLine();
	        System.out.println("Reversed: " + rev(s));
	        sc.close();

	}

}
