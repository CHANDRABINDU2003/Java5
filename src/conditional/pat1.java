
package conditional;

import java.util.Scanner;
public class pat1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int r=inp.nextInt();
        for (int i=0;i<=r;i++){
            for(int j=0;j<r-i;j++){
                System.out.print(" ");
            }
            for(int d=i;d>0;d--){
                System.out.print(" "+d);
            }
            for(int ic=2;ic<=i;ic++){
                System.out.print(" "+ic);
            }
            System.out.println("");
        }
         for (int i=r-1;i>0;i--){
            for(int j=0;j<r-i;j++){
                System.out.print(" ");
            }
            for(int d=i;d>0;d--){
                System.out.print(" "+d);
            }
            for(int ic=2;ic<=i;ic++){
                System.out.print(" "+ic);
            }
            System.out.println("");
        }
    }
  
}