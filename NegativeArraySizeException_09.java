package in.exceptionhandler;
import java.util.*;

public class NegativeArraySizeException_09 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size=sc.nextInt();

        try{
            int[] a=new int[size];
            System.out.println("Array created.");
        }catch(NegativeArraySizeException e){
            System.out.println("Error: Size cannot be negative!");
        }

        sc.close();
    }
}

