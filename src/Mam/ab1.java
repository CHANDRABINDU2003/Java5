
package Mam;

abstract class Bank{
    abstract int getbalance();
}
class BankA extends Bank{
    int getbalance(){
        return 100;
    }
}
class BankB extends Bank{
    int getbalance(){
        return 150;
    }
}
public class ab1 {
    public static void main(String[] args) {
      Bank a;
      a=new BankA();
        System.out.println(a.getbalance());
        a= new BankB();
        System.out.println(a.getbalance());
    }
   
}
