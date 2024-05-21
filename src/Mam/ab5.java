
package Mam;
import java.util.Scanner;
abstract class shape{
    abstract int rectangle(int len,int wid);
    abstract float circle(int rad);
    abstract int square(int side);
}
class Area extends shape{
    int rectangle(int l,int w){
        return (l*w);
    }
    float circle(int r){
        return (3.14f*r*r);
    }
    int square(int s){
        return (s*s);
    }
}
public class ab5 {
    public static void main(String[] args) {
     Area a = new Area();
        Scanner in= new Scanner(System.in);
        int x=in.nextInt();
        for(int i=0;i<x;i++){
            System.out.println("give for circle");
            int rad=in.nextInt();
            System.out.println(a.circle(rad));
            System.out.println("give for rectangle ");
            int len=in.nextInt();
            int wid=in.nextInt();
            System.out.println(a.rectangle(len, wid));
            System.out.println("give for square");
            int si=in.nextInt();
            System.out.println(a.square(si));
        }
    }
    
}
