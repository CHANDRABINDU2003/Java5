
package finalprep;

import java.util.Scanner;
public class CompareTwoDig {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x=inp.nextInt();
        int y =inp.nextInt();
        System.out.println("first dig"+x);
        System.out.println("second dig"+y);
        System.out.println("sum is"+(x+y));
        System.out.println("difference is"+(x-y));
        System.out.println("product"+(x*y));
        System.out.println("average is"+((x+y)/2));
        if(x>y){
            System.out.println("max is"+x);
        }
        else {
            System.out.println("min is"+x);
        }
         if(x<y){
            System.out.println("max is"+y);
        }
        else {
            System.out.println("min is"+y);
        }
        
    }
   
}
