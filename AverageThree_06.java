package in.overloading;
import java.util.*;

public class AverageThree_06 {
    static double avg(int a,int b,int c){ return (a+b+c)/3.0; }
    static double avg(double a,double b,double c){ return (a+b+c)/3.0; }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter three integers: ");
        System.out.println("Average = "+avg(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        System.out.print("Enter three doubles: ");
        System.out.println("Average = "+avg(sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
        sc.close();
    }
}
