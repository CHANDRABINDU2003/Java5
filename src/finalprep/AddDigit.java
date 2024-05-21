
package finalprep;

import java.util.Scanner;
public class AddDigit {  
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        
        int x= inp.nextInt();
       
       int f= x%10;
       int rem=x/10;
     int s=rem%10;
     rem= rem/10;
     int t = rem%10;
     rem = rem/10;
     int fr=rem%10;
     rem=rem/10;
     int sum= f+s+t+fr;
        System.out.println("the sum is "+sum);
       
       
    }
   
}
