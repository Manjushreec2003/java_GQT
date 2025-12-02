package in.overloading;
import java.util.*;

public class AreaParallelogram_21 {
    static double area(double base,double height){ return base*height; }
    static double area(double a,double b,double angleDeg){ return a*b*Math.sin(Math.toRadians(angleDeg)); }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter base and height: ");
        System.out.println("Area = "+area(sc.nextDouble(), sc.nextDouble()));
        sc.close();
    }
}
