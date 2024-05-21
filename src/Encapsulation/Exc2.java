
package Encapsulation;
import java.util.Scanner;

public class Exc2 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int x= in.nextInt();
        try{
            if(x<0){
                
              throw new Exception("it is an exception");
             
            }
             System.out.println("the squart is"+Math.sqrt(x));
              
            
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("rest of the code");
     }
    
}