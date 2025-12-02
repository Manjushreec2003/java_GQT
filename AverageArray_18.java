package in.overloading;
import java.util.*;

public class AverageArray_18 {
    static double avg(int[] a){
        int s=0; for(int x:a) s+=x; return s/(double)a.length;
    }
    static double avg(double[] a){
        double s=0; for(double x:a) s+=x; return s/a.length;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of int array: ");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        System.out.println("Average = "+avg(a));
        sc.close();
    }
}
