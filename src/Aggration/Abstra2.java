
package Aggration;

abstract class bike{
    bike(){
        System.out.println("GO");
    }
    abstract void run();
    
}
class honda extends bike{
void run(){
    System.out.println("BYE BYE");
}}
public class Abstra2{
    public static void main(String[] args) {
      bike a= new honda();
      a.run();
    }
}
 
