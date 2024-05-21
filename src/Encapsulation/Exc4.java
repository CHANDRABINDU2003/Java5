
package Encapsulation;

import java.io.IOException;
class exceptionA extends Exception{
    public exceptionA(String msg){
        super(msg);
    }
}
class exceptionB extends exceptionA{
    public exceptionB(String msg){
        super(msg);
    }
}
public class Exc4 {
    public static void main(String[] args) {
      try{
          throw new exceptionA("it is for A");
      }
      catch(Exception e){
          System.out.println(e);
      }
      try{
          throw new  NullPointerException("it is null");
          
      }
      catch(Exception e){
          System.out.println(e);
      }
      try{
          throw new IOException("it is for IO");
      }
      catch(Exception e){
          System.out.println(e);
      }
    }
   
}
