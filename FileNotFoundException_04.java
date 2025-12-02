package in.exceptionhandler;

import java.util.*;
import java.io.*;

public class FileNotFoundException_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter filename: ");
        String name = sc.nextLine();

        try {
            FileReader fr = new FileReader(name);
            System.out.println("File opened successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
        }

        sc.close();
    }
}
