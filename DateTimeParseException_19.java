package in.exceptionhandler;
import java.time.*;
import java.time.format.*;
import java.util.*;

public class DateTimeParseException_19 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter date (yyyy-mm-dd): ");
        String s=sc.nextLine();

        try{
            LocalDate.parse(s);
            System.out.println("Valid date.");
        }catch(DateTimeParseException e){
            System.out.println("Error: Invalid date format!");
        }

        sc.close();
    }
}
