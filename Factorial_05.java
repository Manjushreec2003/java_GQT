package in.overloading;
import java.util.*;

public class Factorial_05 {
    static long fact(int n){
        long f=1; for(int i=1;i<=n;i++) f*=i; return f;
    }
    static long fact(long n){ long f=1; for(long i=1;i<=n;i++) f*=i; return f; }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter integer n: ");
        System.out.println("Factorial = "+fact(sc.nextInt()));
        System.out.print("Enter long n: ");
        System.out.println("Factorial = "+fact(sc.nextLong()));
        sc.close();
    }
}
