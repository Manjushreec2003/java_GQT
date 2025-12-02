package in.overloading;
import java.util.*;

public class CtoF_15 {
    static double convert(double c){ return c*9/5 + 32; }
    static double convert(int c){ return c*9/5.0 + 32; }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Celsius (double): ");
        System.out.println("F = "+convert(sc.nextDouble()));
        System.out.print("Enter Celsius (int): ");
        System.out.println("F = "+convert(sc.nextInt()));
        sc.close();
    }
}
