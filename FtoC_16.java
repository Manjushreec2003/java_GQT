package in.overloading;
import java.util.*;

public class FtoC_16 {
    static double convert(double f){ return (f-32)*5/9; }
    static double convert(int f){ return (f-32)*5/9.0; }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Fahrenheit (double): ");
        System.out.println("C = "+convert(sc.nextDouble()));
        System.out.print("Enter Fahrenheit (int): ");
        System.out.println("C = "+convert(sc.nextInt()));
        sc.close();
    }
}
