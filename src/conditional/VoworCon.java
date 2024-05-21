
package conditional;

import java.util.Scanner;
public class VoworCon {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        char p = inp.next().charAt(0);
        if(p=='a'||p=='e'||p=='i'||p=='o'||p=='u'){
            System.out.println("it is vowel");
        }
        else 
            System.out.println("it is consonant");
        
        
    }
   
}
