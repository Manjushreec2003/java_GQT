package in.exceptionhandler;
import java.util.*;

public class NumberFormatException_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        String s = sc.nextLine();

        try {
            int n = Integer.parseInt(s);
            System.out.println("Converted = " + n);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format!");
        }

        sc.close();
    }
}
