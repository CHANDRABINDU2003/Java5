
package ArrayString;


public class Pat1 {    public static void main(String[] args) {
        
    
 int n=7; 
int i,j; 
//inner loop  
 for(i=0;i<n;i++){
     for(j=0;j<i;j++)
     {
         System.out.print("* "); 
     }
     System.out.println("");
 }
 for(i=n-1;i>0;i--){
     for(j=0;j<i;j++)
     {
         System.out.print("* "); 
     }
     System.out.println("");
 }
    }}