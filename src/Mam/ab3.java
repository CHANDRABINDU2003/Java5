
package Mam;
abstract class roshni{
    public roshni(){
        System.out.println("this is abstract class constructor");}
    abstract void method1();
    void method2(){
        System.out.println("this is normal method");
    }
}
class mim extends roshni{
    void method1(){
        System.out.println("hellooooo");
    }
}
public class ab3 {
    public static void main(String[] args) {
      mim m= new mim();
      m.method1();
      m.method2();
    }
    
}
