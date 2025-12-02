package in.exceptionhandler;

import java.util.*;

public class UnsupportedOperationException_14 {
    public static void main(String[] args){
        List<String> list = List.of("A", "B", "C");

        try{
            list.add("D");
        }catch(UnsupportedOperationException e){
            System.out.println("Error: Modification not supported!");
        }
    }
}

