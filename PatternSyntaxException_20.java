package in.exceptionhandler;
import java.util.regex.*;

public class PatternSyntaxException_20 {
    public static void main(String[] args){
        try{
            Pattern.compile("[A-Z+"); // invalid regex
        }catch(PatternSyntaxException e){
            System.out.println("Error: Invalid regex pattern!");
        }
    }
}
