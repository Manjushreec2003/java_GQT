package in.overloading;
import java.util.*;

public class CompoundInterest_19 {
    static double amount(double p,double r,int t){ return p*Math.pow(1+r/100,t); }
    static double amount(double p,double r,double t){ return p*Math.pow(1+r/100.0,t); }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter principal, rate(%), years: ");
        System.out.println("Amount = "+amount(sc.nextDouble(), sc.nextDouble(), sc.nextInt()));
        sc.close();
    }
}
