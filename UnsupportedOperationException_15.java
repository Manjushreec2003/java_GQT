package in.exceptionhandler;

import java.util.*;

public class UnsupportedOperationException_15 {
    public static void main(String[] args){
        List<Integer> nums = List.of(1,2,3);

        try{
            nums.remove(0);
        }catch(UnsupportedOperationException e){
            System.out.println("Error: Cannot modify unmodifiable list!");
        }
    }
}
