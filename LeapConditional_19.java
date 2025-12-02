package in.operators;
import java.util.*;
public class LeapConditional_19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int y = sc.nextInt();
        boolean isLeap = (y%400==0) || (y%4==0 && y%100!=0);
        System.out.println(isLeap ? "Leap year" : "Not leap year");
        sc.close();
	}

}
