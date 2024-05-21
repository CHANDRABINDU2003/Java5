
package Encapsulation;
import java.io.IOException;
class ExceptionA extends Exception{
    public ExceptionA(String msg){
        super(msg);
    }
}

public class Exc41 {
    public static void main(String[] args) {
    try{
        throw new ExceptionA("it is for A");
    } 
    catch(ExceptionA e){
        System.out.println(e);
    }
    try{
        throw new NullPointerException("NULL");
    }
    catch(RuntimeException e){
        System.out.println(e);
    }
    try{
        throw new IOException("it is IO");
    }
    catch(IOException e){
        System.out.println(e);
    }
    
        System.out.println("rest of the code");
    
    }


}
   