package in.overloading;
import java.util.*;

public class MaxTwo_07 {
    static int max(int a,int b){ return a>b?a:b; }
    static double max(double a,double b){ return a>b?a:b; }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two ints: ");
        System.out.println("Max = "+max(sc.nextInt(), sc.nextInt()));
        System.out.print("Enter two doubles: ");
        System.out.println("Max = "+max(sc.nextDouble(), sc.nextDouble()));
        sc.close();
    }
}
