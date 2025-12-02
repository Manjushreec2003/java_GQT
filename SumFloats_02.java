package in.overloading;
import java.util.*;

public class SumFloats_02 {
    static float sum(float a,float b){ return a+b; }
    static double sum(double a,double b,double c){ return a+b+c; }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two floats: ");
        float a=sc.nextFloat(), b=sc.nextFloat();
        System.out.println("Sum = "+sum(a,b));
        System.out.print("Enter three doubles: ");
        double x=sc.nextDouble(), y=sc.nextDouble(), z=sc.nextDouble();
        System.out.println("Sum = "+sum(x,y,z));
        sc.close();
    }
}
