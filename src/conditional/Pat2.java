
package conditional;

import java.util.Scanner;
public class Pat2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int r= inp.nextInt();
        
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r-i;j++){
                System.out.print(" ");
            }
            for(int d=i;d>=1;d--){
                System.out.print((char)('A'+d-1));
            }
            for(int d=2;d<=i;d++){
                System.out.print((char)('A'+d-1));
            }
            System.out.println("");
        }
         for(int i=r-1;i>=1;i--){
            for(int j=1;j<=r-i;j++){
                System.out.print(" ");
            }
            for(int d=i;d>=1;d--){
                System.out.print((char)('A'+d-1));
            }
            for(int d=2;d<=i;d++){
                System.out.print((char)('A'+d-1));
            }
            System.out.println("");
        }
    }
   
}
