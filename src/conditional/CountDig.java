
package conditional;

import java.util.Scanner;
public class CountDig {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        long x=inp.nextLong();
        long tempnum=x;
        int dig=0;
        while(x!=0){
            long r=x%10;
          
            x=x/10;
              dig++;
        }
        System.out.println(""+dig);
        
    }
   
}
