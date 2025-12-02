package in.datatypes;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerFactorial_19 {

    static BigInteger fact(int n) {
        BigInteger f = BigInteger.ONE;
        for (int i = 1; i <= n; i++)
            f = f.multiply(BigInteger.valueOf(i));
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        System.out.println(fact(n));
        sc.close();
    }
}
