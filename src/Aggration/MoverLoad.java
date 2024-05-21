
package Aggration;
 class add{
      int sum1(int a,int b){
         return a+b;
     }
      int sum2(int a,int b,int c){
         return a+b+c;
     }
 }
public class MoverLoad {
    public static void main(String[] args) {
        add a= new add();
        System.out.println("the sum is"+a.sum1(10,12));
        System.out.println(a.sum2(22,2,3));
    }
    
}
