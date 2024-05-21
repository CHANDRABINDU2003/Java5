
package ArrayString;


public class Pat2 {
    public static void main(String[] args) {
        int i,j, r=6;
         for( i=6;i>0;i--){
            for(j=r-i;j>0;j--){
                System.out.print(" ");  
            }
            for(j=0;j<i;j++){
                System.out.print(" *");
            }
            System.out.println("");
        }
        for( i=1;i<6;i++){
            for(j=r-i;j>0;j--){
                System.out.print(" ");  
            }
            for(j=0;j<i;j++){
                System.out.print(" *");
            }
            System.out.println("");
        }
       
    }
    
}
