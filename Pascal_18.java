package in.introduction;
import java.util.*;
public class Pascal_18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            int val = 1;
            for(int k = 0; k <= i; k++) {
                System.out.print(val + " ");
                val = val * (i - k) / (k + 1);
            }
            System.out.println();
        }
        sc.close();
	}

}
