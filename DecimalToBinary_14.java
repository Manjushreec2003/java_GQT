package in.introduction;
import java.util.*;
public class DecimalToBinary_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal: ");
        int n = sc.nextInt();
        System.out.println("Binary = " + Integer.toBinaryString(n));
        sc.close();
	}

}
