package in.overloading;
import java.util.*;

public class AreaRectangle_03 {
    static int area(int l,int w){ return l*w; }
    static double area(double l,double w){ return l*w; }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length and width (int): ");
        System.out.println("Area = "+area(sc.nextInt(), sc.nextInt()));
        System.out.print("Enter length and width (double): ");
        System.out.println("Area = "+area(sc.nextDouble(), sc.nextDouble()));
        sc.close();
    }
}
