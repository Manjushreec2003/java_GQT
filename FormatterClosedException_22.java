package in.exceptionhandler;
import java.util.*;

public class FormatterClosedException_22 {
    public static void main(String[] args){
        Formatter f = new Formatter();
        f.close();

        try{
            f.format("Hello");
        }catch(FormatterClosedException e){
            System.out.println("Error: Formatter is closed!");
        }
    }
}
