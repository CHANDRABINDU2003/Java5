
package ArrayString;


public class Number {
    public static void main(String[] args) {
        int i,j,k,n=3;
        int am=0;
        for(i=1;i<=3;i++){
            for(j=1;j<=3;j++){
                for(k=1;k<3;k++){
                    if(i!=j&&j!=k&&k!=i){
                        am++;
                        System.out.println(i+""+j+""+k);
                    }
                }
            }
        }
        System.out.println(am);
    }
  
}
