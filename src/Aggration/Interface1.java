
package Aggration;

interface  bank{
    int interest();
}
class janata implements bank{
    public int interest (){
        return 7;}
}
class pubali implements bank{
    public int interest(){
        return 9;}
}
public class Interface1 {
    public static void main(String[] args) {
      bank a = new janata();
      bank b= new pubali();
        System.out.println(a.interest());
        System.out.println(b.interest());
    }
   
}
