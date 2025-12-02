package in.overloading;
import java.util.*;

public class AreaTrapezoid_20 {
    static double area(double a,double b,double h){ return 0.5*(a+b)*h; }
    static double area(int a,int b,int h){ return 0.5*(a+b)*h; }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter bases and height: ");
        System.out.println("Area = "+area(sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
        sc.close();
    }
}
