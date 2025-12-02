package in.overloading;
import java.util.*;

public class MinTwo_08 {
    static int min(int a,int b){ return a<b?a:b; }
    static double min(double a,double b){ return a<b?a:b; }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two ints: ");
        System.out.println("Min = "+min(sc.nextInt(), sc.nextInt()));
        System.out.print("Enter two doubles: ");
        System.out.println("Min = "+min(sc.nextDouble(), sc.nextDouble()));
        sc.close();
    }
}
