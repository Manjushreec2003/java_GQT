package in.exceptionhandler;
import java.nio.*;

public class BufferOverflowException_23 {
    public static void main(String[] args){
        try{
            ByteBuffer b = ByteBuffer.allocate(2);
            b.put((byte)1);
            b.put((byte)2);
            b.put((byte)3);
        }catch(BufferOverflowException e){
            System.out.println("Error: Buffer overflow!");
        }
    }
}
