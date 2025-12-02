package in.overloading;
import java.util.*;

public class AreaCircle_13 {
    static double area(double r){ return Math.PI*r*r; }
    static double area(int d){ double r=d/2.0; return Math.PI*r*r; }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter radius (double): ");
        System.out.println("Area = "+area(sc.nextDouble()));
        System.out.print("Enter diameter (int): ");
        System.out.println("Area = "+area(sc.nextInt()));
        sc.close();
    }
}

