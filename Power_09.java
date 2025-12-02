package in.overloading;
import java.util.*;

public class Power_09 {
    static double pow(double b,int e){ return Math.pow(b,e); }
    static double pow(int b,int e){ return Math.pow(b,e); }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter base (double) and exponent (int): ");
        System.out.println("Result = "+pow(sc.nextDouble(), sc.nextInt()));
        System.out.print("Enter base (int) and exponent (int): ");
        System.out.println("Result = "+pow(sc.nextInt(), sc.nextInt()));
        sc.close();
    }
}
