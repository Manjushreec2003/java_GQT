package in.operators;
import java.util.*;
public class Arithmetic_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        if(b != 0) System.out.println("a / b = " + (a / b));
        else System.out.println("Division by zero");
        sc.close();
	}

}
