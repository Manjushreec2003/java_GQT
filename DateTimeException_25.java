package in.exceptionhandler;

import java.time.*;

public class DateTimeException_25 {
    public static void main(String[] args){
        try{
            LocalDate.of(2025, 13, 10); // invalid month
        }catch(DateTimeException e){
            System.out.println("Error: Invalid date values!");
        }
    }
}
