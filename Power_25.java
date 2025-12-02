package in.introduction;
import java.util.*;

public class Power_25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int b = sc.nextInt();
        System.out.print("Enter exponent: ");
        int e = sc.nextInt();

        int pow = 1;
        for(int i = 1; i <= e; i++)
            pow *= b;

        System.out.println("Result = " + pow);
        sc.close();
	}

}
