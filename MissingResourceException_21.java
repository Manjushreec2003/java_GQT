package in.exceptionhandler;

import java.util.*;

public class MissingResourceException_21 {
    public static void main(String[] args){
        try{
            ResourceBundle rb = ResourceBundle.getBundle("unknown_file");
        }catch(MissingResourceException e){
            System.out.println("Error: Resource not found!");
        }
    }
}
