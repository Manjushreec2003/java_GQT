package in.operators;
import java.util.*;
public class ArmstrongWhile_25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        int digits = 0;
        int t = n;
        while(t != 0) { digits++; t /= 10; }
        while(n != 0) {
            int d = n % 10;
            sum += (int)Math.pow(d, digits);
            n /= 10;
        }
        System.out.println(sum == temp ? "Armstrong" : "Not Armstrong");
        sc.close();
	}

}
