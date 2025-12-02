package in.overloading;
import java.util.*;

public class PerimeterRectangle_12 {
    static int perimeter(int l,int w){ return 2*(l+w); }
    static double perimeter(double l,double w){ return 2*(l+w); }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter l and w (int): ");
        System.out.println("Perimeter = "+perimeter(sc.nextInt(), sc.nextInt()));
        System.out.print("Enter l and w (double): ");
        System.out.println("Perimeter = "+perimeter(sc.nextDouble(), sc.nextDouble()));
        sc.close();
    }
}
