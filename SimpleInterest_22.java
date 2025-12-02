package in.overloading;
import java.util.*;

public class SimpleInterest_22 {
    static double si(double p,double r,double t){ return (p*r*t)/100.0; }
    static double si(double p,int r,int t){ return (p*r*t)/100.0; }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter principal, rate, time: ");
        System.out.println("SI = "+si(sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
        sc.close();
    }
}
