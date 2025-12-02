package in.exceptionhandler;
import java.util.*;

public class ArrayIndexException_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30};
        System.out.print("Enter index (0-2): ");
        int index = sc.nextInt();

        try {
            System.out.println("Value = " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index!");
        }

        sc.close();
    }
}
