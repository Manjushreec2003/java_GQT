package in.overloading;
import java.util.*;

public class SumIntegers_01 {
    static int sum(int a,int b){ return a+b; }
    static int sum(int a,int b,int c){ return a+b+c; }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int a=sc.nextInt(), b=sc.nextInt();
        System.out.println("Sum = "+sum(a,b));
        System.out.print("Enter three integers: ");
        int x=sc.nextInt(), y=sc.nextInt(), z=sc.nextInt();
        System.out.println("Sum = "+sum(x,y,z));
        sc.close();
    }
}
