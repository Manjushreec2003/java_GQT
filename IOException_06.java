package in.exceptionhandler;

import java.util.*;
public class IOException_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any text: ");

        try {
            String s = sc.nextLine();
            System.out.println("You typed: " + s);
        } catch (Exception e) {
            System.out.println("Input error occurred!");
        }

        sc.close();
    }
}
