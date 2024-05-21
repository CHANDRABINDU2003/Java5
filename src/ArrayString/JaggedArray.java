
package ArrayString;


public class JaggedArray {
    public static void main(String[] args) {
        int arr[][]=new int[3][];
        int count=0;
        arr[0]=new int[3];
        arr[1]=new int[5];
        arr[2]=new int[2];
        for(int i=1;i<=arr.length;i++)
        {
            for(int j=1;j<=arr[i].length;j++){
                System.out.print(" "+count);
                count++;
            }
            System.out.println("");
        }
    }
   
}
