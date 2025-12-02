package in.introduction;
import java.util.*;

public class SecondLargest_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter elements:");
        for(int i=0;i<n;i++) a[i]=sc.nextInt();

        Arrays.sort(a);
        System.out.println("Second largest = " + a[n-2]);
        sc.close();
	}

}
