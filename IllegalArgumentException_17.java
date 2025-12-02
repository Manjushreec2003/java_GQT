package in.exceptionhandler;

import java.util.*;

public class IllegalArgumentException_17 {
    static void checkAge(int age){
        if(age < 0) throw new IllegalArgumentException("Age cannot be negative");
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter age: ");
        int age=sc.nextInt();

        try{
            checkAge(age);
            System.out.println("Valid age.");
        }catch(IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}

