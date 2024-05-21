
package Aggration;

class bank{
  int  interest(){
        return 0;
    }
}
class janata extends bank{
    int interest (){
        return 7;
}
}
class pubali extends bank{
    int interest(){
        return 5;}}
class icic extends bank{
    int interest(){
        return 10;
    }}
public class MoverRid {
    public static void main(String[] args) {
   janata a= new janata();
        System.out.println("the interest is "+a.interest());    
    }
  
}
