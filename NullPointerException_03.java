package in.exceptionhandler;
import java.util.*;

public class NullPointerException_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = null;

        try {
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("Error: String is null!");
        }

        sc.close();
    }
}
