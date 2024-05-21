
package Mam;
abstract class animal{
    abstract void cat();
    abstract void dog();
}
class cats extends animal{
    void cat(){
        System.out.println("meow");
    }
    void dog(){
        
    }
}
class dogs extends animal{
    void cat(){
   
    }
    void dog(){
        System.out.println("bark");
    }

}

public class ab4 {
    public static void main(String[] args) {
      cats c=new cats();  
      dogs d=new dogs();
      c.cat();
      d.dog();
    }
 
}
