package in.datatypes;
import java.util.Scanner;
public class IntBinary_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String bin = Integer.toBinaryString(n);
        System.out.println(bin);

        int back = Integer.parseInt(bin, 2);
        System.out.println(back);
        sc.close();
	}

}
