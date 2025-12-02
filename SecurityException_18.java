package in.exceptionhandler;

public class SecurityException_18 {
    static void checkPermission(boolean allowed){
        if(!allowed){
            throw new SecurityException("You do not have permission!");
        }
        System.out.println("Operation allowed.");
    }

    public static void main(String[] args){
        try{
            checkPermission(false);  // this will throw SecurityException
        }catch(SecurityException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
