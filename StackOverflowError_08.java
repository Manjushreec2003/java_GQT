package in.exceptionhandler;

public class StackOverflowError_08 {
    static void recurse() {
        recurse();
    }

    public static void main(String[] args) {
        try {
            recurse();
        } catch (StackOverflowError e) {
            System.out.println("Error: Stack overflow occurred!");
        }
    }
}

