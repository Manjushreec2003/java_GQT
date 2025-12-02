package in.exceptionhandler;
import java.util.*;

public class IllegalStateException_12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.close();

        try{
            sc.nextInt();
        }catch(IllegalStateException e){
            System.out.println("Error: Scanner already closed!");
        }
    }
}
