package in.operators;
import java.util.*;
public class CircleArea_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        System.out.println("Area = " + (Math.PI * r * r));
        sc.close();
	}

}
