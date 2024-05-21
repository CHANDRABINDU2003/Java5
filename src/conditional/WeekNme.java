
package conditional;

import java.util.Scanner;
public class WeekNme {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        int day= inp.nextInt();
        String dn="";
        switch(day){
            case 1:
                dn="Saturday";
break;
            case 2:
                 dn="Sunday";
break;
        }
        System.out.println(""+dn);
    }
    
}
