package in.overloading;
import java.util.*;

public class AreaTriangle_14 {
    static double area(double b,double h){ return 0.5*b*h; }
    static double area(int a,int b,int c){
        double s=(a+b+c)/2.0;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter base and height: ");
        System.out.println("Area = "+area(sc.nextDouble(), sc.nextDouble()));
        System.out.print("Enter three sides: ");
        System.out.println("Area = "+area(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        sc.close();
    }
}
