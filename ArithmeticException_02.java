package in.exceptionhandler;
import java.util.*;

public class ArithmeticException_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numerator: ");
        int a = sc.nextInt();
        System.out.print("Enter denominator: ");
        int b = sc.nextInt();

        try {
            System.out.println("Result = " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        }

        sc.close();
    }
}

