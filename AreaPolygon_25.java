package in.overloading;
import java.util.*;

public class AreaPolygon_25 {
    static double area(int n,double side){ return (n*side*side)/(4*Math.tan(Math.PI/n)); }
    static double area(double apothem,double perimeter){ return (apothem*perimeter)/2.0; }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of sides and side length: ");
        System.out.println("Area = "+area(sc.nextInt(), sc.nextDouble()));
        sc.close();
    }
}
