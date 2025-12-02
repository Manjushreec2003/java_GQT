package in.exceptionhandler;
import java.nio.*;

public class BufferUnderflowException_24 {
    public static void main(String[] args){
        try{
            ByteBuffer b = ByteBuffer.allocate(2);
            b.get();
        }catch(BufferUnderflowException e){
            System.out.println("Error: Buffer underflow!");
        }
    }
}
