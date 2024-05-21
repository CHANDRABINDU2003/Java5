
package finalprep;

import java.util.Scanner;
public class separateDig {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int x= inp.nextInt();
        int n=x;
        while(x!=0){
            int a=x%10;
            System.out.print(" "+a);
             x=x/10;
        }
    }
  
}
