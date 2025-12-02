package in.operators;
import java.util.*;
public class DivBy5And7_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        if(n % 5 == 0 && n % 7 == 0) System.out.println("Divisible by both 5 and 7");
        else System.out.println("Not divisible by both 5 and 7");
        sc.close();
	}

}
