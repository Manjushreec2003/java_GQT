package in.exceptionhandler;

public class InterruptedException_10 {
    public static void main(String[] args) {
        try {
            Thread.sleep(100);
            System.out.println("Thread awake.");
        } catch (InterruptedException e) {
            System.out.println("Error: Thread interrupted!");
        }
    }
}
