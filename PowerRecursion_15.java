package in.operators;
import java.util.*;
public class PowerRecursion_15 {
	static long power(long b, int e) {
        if(e == 0) return 1;
        return b * power(b, e-1);
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        long b = sc.nextLong();
        System.out.print("Enter exponent: ");
        int e = sc.nextInt();
        System.out.println("Result = " + power(b, e));
        sc.close();
	}

}
