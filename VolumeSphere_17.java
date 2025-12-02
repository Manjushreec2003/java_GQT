package in.overloading;
import java.util.*;

public class VolumeSphere_17 {
    static double volume(double r){ return (4.0/3.0)*Math.PI*r*r*r; }
    static double volume(int d){ double r=d/2.0; return (4.0/3.0)*Math.PI*r*r*r; }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter radius: ");
        System.out.println("Volume = "+volume(sc.nextDouble()));
        System.out.print("Enter diameter (int): ");
        System.out.println("Volume = "+volume(sc.nextInt()));
        sc.close();
    }
}
