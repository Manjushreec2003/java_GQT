package in.exceptionhandler;

public class ClassNotFoundException_07 {
    public static void main(String[] args) {
        try {
            Class.forName("abc.xyz.UnknownClass");
        } catch (ClassNotFoundException e) {
            System.out.println("Error: Class not found!");
        }
    }
}

