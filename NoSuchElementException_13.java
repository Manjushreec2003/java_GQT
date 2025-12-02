package in.exceptionhandler;
import java.util.*;

public class NoSuchElementException_13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter integer: " + sc.nextInt());
        }catch(NoSuchElementException e){
            System.out.println("Error: No such element!");
        }

        sc.close();
    }
}
