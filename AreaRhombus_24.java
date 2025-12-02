package in.overloading;
import java.util.*;
public class AreaRhombus_24 {
    static double area(double d1, double d2) {
        return (d1 * d2) / 2;
    }
    static double area(double side, int angle) {
        return side * side * Math.sin(Math.toRadians(angle));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter d1 and d2: ");
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        System.out.println("Area = " + area(d1, d2));

        System.out.print("Enter side and angle: ");
        double s = sc.nextDouble();
        int a = sc.nextInt();   
        System.out.println("Area = " + area(s, a));

        sc.close();
    }
}
