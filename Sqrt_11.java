package in.overloading;
import java.util.*;

public class Sqrt_11 {
    static double sqrt(double x){ return Math.sqrt(x); }
    static double sqrt(int x){ return Math.sqrt(x); }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number (double): ");
        System.out.println("Sqrt = "+sqrt(sc.nextDouble()));
        System.out.print("Enter number (int): ");
        System.out.println("Sqrt = "+sqrt(sc.nextInt()));
        sc.close();
    }
}
