
package Mam;
abstract class Marks{
    abstract int percent();
}
class A extends Marks{
    int a;
    int b;
    int c;
    public A(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
        
    }
    int percent(){
        return (a+b+c)*100/300;
    }
}
class B extends Marks{
    int a;
    int b;
    int c;
    int d;
    public B(int a,int b,int c,int d){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
    }
    int percent(){
        return(a+b+c+d)*100/400;
    }
}

public class ab2 {
    public static void main(String[] args) {
     A a= new A(50,60,70);
     B b= new B(23,56,78,90);
        System.out.println(a.percent());
        System.out.println(b.percent());
    }
   
}
