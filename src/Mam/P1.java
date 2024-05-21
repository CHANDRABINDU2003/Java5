
package Mam;
class shape{
    void show(){
        System.out.println("this is a parent class method");   
    }
    void getinf(){
        System.out.println("this is for parent");
    }
}
class circle extends shape{
    void show(){
        System.out.println("this is for child1");
    }
}
class circle2 extends shape{
    void show(){
        System.out.println("this is for child2");
    }
}

public class P1 {
    public static void main(String[] args) {
       shape a= new circle();
       a.getinf();
       a.show();
       shape b= new circle2();
       b.getinf();
       b.show();
    }
   
}
