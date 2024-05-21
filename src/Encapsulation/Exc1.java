
package Encapsulation;


public class Exc1 {
    
 public static void main(String[] args) {
    int a[] = new int[6];
try {
    a[8] = 7 / 0;
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println(e);
} catch (ArithmeticException e) {
    System.out.println(e);
}
System.out.println("rest of the code");

     System.out.println("rest of thecode");
 }
}

