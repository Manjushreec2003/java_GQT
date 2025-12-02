package in.exceptionhandler;

public class ArrayStoreException_11 {
    public static void main(String[] args){
        try{
            Object[] arr = new String[3];
            arr[0] = 10;
        }catch(ArrayStoreException e){
            System.out.println("Error: Wrong data type stored!");
        }
    }
}
