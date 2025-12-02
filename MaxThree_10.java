package in.operators;
import java.util.*;
public class MaxThree_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter first: ");
        int a = sc.nextInt();
        System.out.print("Enter second: ");
        int b = sc.nextInt();
        System.out.print("Enter third: ");
        int c = sc.nextInt();
        int max = (a > b ? a : b) > c ? (a > b ? a : b) : c;
        System.out.println("Maximum = " + max);
        sc.close();
	}

}
