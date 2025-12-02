package in.operators;
import java.util.*;
public class LCM_20 {
	static int gcd(int a,int b) {
        while(b!=0) { int t=b; b=a%b; a=t; }
        return a;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        int l = (a / gcd(a,b)) * b;
        System.out.println("LCM = " + Math.abs(l));
        sc.close();
	}

}
