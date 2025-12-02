package in.introduction;
import java.util.*;
public class GCD_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();

        while(a != b) {
            if(a > b) a = a - b;
            else b = b - a;
        }

        System.out.println("GCD = " + a);
        sc.close();
	}

}
