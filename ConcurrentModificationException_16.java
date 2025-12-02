package in.exceptionhandler;

import java.util.*;

public class ConcurrentModificationException_16 {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));

        try{
            for (int x : list) {
                list.remove(0);
            }
        }catch(ConcurrentModificationException e){
            System.out.println("Error: Concurrent modification detected!");
        }
    }
}
