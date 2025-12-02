package in.overloading;
import java.util.*;

public class VolumeCylinder_04 {
    static double volume(double r,double h){ return Math.PI*r*r*h; }
    static double volume(double d,int h){ double r=d/2.0; return Math.PI*r*r*h; }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter radius and height: ");
        System.out.println("Volume = "+volume(sc.nextDouble(), sc.nextDouble()));
        System.out.print("Enter diameter and height: ");
        System.out.println("Volume = "+volume(sc.nextDouble(), sc.nextInt()));
        sc.close();
    }
}
