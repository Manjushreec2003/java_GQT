package in.overloading;
import java.util.*;

public class AreaSquare_23 {
    static int area(int side){ return side*side; }
    static double area(double side){ return side*side; }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter side (int): ");
        System.out.println("Area = "+area(sc.nextInt()));
        System.out.print("Enter side (double): ");
        System.out.println("Area = "+area(sc.nextDouble()));
        sc.close();
    }
}
