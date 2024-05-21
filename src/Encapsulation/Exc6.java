
package Encapsulation;


public class Exc6 {
    static void xv(){
    try{
        System.out.println(4/0);
        
    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println(e);
    }
}
    public static void main(String[] args) {
        try{
            try{
                xv();
                
            }
            catch(ArithmeticException e){
                System.out.println(e);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    }
