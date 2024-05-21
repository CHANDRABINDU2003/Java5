
package ArrayString;
import java.util.Scanner;
public class Str1 {
    public static void main(String[] args) {
        
    
  Scanner in= new Scanner(System.in);
String x=in.nextLine();
String [] words=x.split(" ");
for(int i=0;i<words.length-1;i++){
    System.out.print(words[i]);
}
}}
