package in.introduction;
import java.util.*;

public class Circle_20 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter radius: ");
	        double r = sc.nextDouble();

	        System.out.println("Area = " + (Math.PI * r * r));
	        System.out.println("Perimeter = " + (2 * Math.PI * r));
	        sc.close();
	}

}
