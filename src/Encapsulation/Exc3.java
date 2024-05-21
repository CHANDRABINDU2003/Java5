
package Encapsulation;
class ExceptionA extends Exception{
    public ExceptionA(String msg){
        super(msg);
    }
}
class ExceptionB extends ExceptionA{
    public ExceptionB(String msg){
        super(msg);
    }
}
class ExceptionC extends ExceptionB{
    public ExceptionC(String msg){
        super(msg);
    }
}
public class Exc3 {
    public static void main(String[] args) {
    try{
        throw new ExceptionB("it is for B");
    } 
    catch(ExceptionA e){
        System.out.println(e);
    }
    try{
        throw new ExceptionC("it is for C");
    } 
    catch(ExceptionA e){
        System.out.println(e);
    }
    }
   
}
