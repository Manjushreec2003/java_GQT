package in.introduction;
import java.util.*;

public class Armstrong_19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int sum = 0, temp = n;
        while(temp > 0) {
            int d = temp % 10;
            sum += d*d*d;
            temp /= 10;
        }

        System.out.println(sum == n ? "Armstrong" : "Not Armstrong");
        sc.close();
	}

}
