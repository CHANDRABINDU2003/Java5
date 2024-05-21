
package conditional;

import java.util.Scanner;
public class DiamondPat {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        
       int x=inp.nextInt();
       for(int i=1;i<=x;i++){
           for(int j=1;j<=x-i;j++){
               System.out.print(" ");
           }
           for(int k=1;k<=i;k++){
               System.out.print(" *");
           }
           System.out.println("");
       }
       for(int i=x;i>=1;i--){
           for(int j=1;j<=x-i;j++){
               System.out.print(" ");
           }
           for(int k=1;k<=i;k++){
               System.out.print(" *");
           }
           System.out.println("");
       }
    }
  
}
