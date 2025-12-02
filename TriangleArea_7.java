package in.introduction;
import java.util.*;

public class TriangleArea_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        double b = sc.nextDouble();
        System.out.print("Enter height: ");
        double h = sc.nextDouble();
        System.out.println("Area = " + (0.5 * b * h));
        sc.close();
	}

}
