package in.operators;
import java.util.*;
public class HeronTriangle_21 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter side a: ");
	        double a = sc.nextDouble();
	        System.out.print("Enter side b: ");
	        double b = sc.nextDouble();
	        System.out.print("Enter side c: ");
	        double c = sc.nextDouble();
	        double s = (a + b + c) / 2.0;
	        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
	        System.out.println("Area = " + area);
	        sc.close();
	}

}
