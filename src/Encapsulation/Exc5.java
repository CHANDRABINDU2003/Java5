
package Encapsulation;
public class Exc5 {
    static void method1() throws Exception{
        throw new Exception("it is ..");
    }
    static void method2()throws Exception{
        method1();
        
    }
    public static void main(String[] args) {
     try{
         method1();
     }
     catch(Exception e){
       e.printStackTrace();
     }
    }
}
