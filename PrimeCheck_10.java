package in.overloading;
import java.util.*;

public class PrimeCheck_10 {
    static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2;i<=Math.sqrt(n);i++) if(n%i==0) return false;
        return true;
    }
    static boolean isPrime(long n){ return isPrime((int)n); }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter integer: ");
        System.out.println(isPrime(sc.nextInt()) ? "Prime" : "Not Prime");
        System.out.print("Enter long: ");
        System.out.println(isPrime(sc.nextLong()) ? "Prime" : "Not Prime");
        sc.close();
    }
}
