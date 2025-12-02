package in.operators;
import java.util.*;
public class CompoundInterest_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal: ");
        double p = sc.nextDouble();
        System.out.print("Enter annual rate (%) : ");
        double r = sc.nextDouble();
        System.out.print("Enter years: ");
        double t = sc.nextDouble();
        double amount = p * Math.pow(1 + r/100, t);
        System.out.println("Amount = " + amount);
        sc.close();
	}

}
