
package Aggration;
abstract class bank{
abstract int interest();   
}

class janata extends bank{
    int interest (){
        return 7;
    }
}
class pubali extends bank{
    int interest (){
        return 8;
    }
}

    
public class Abstra {
    public static void main(String[] args) {
     bank b;
     
     b=new janata();
        System.out.println(b.interest());
    }
   
}
