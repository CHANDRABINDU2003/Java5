
public class LinearSort {
    public static int linear(int arr[],int x){
        for(int i=0;i<arr.length;i++){
            if(x==arr[i]){
                return i+1;
            }
        }
        
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7,8,9};
        int x=6;
        System.out.println("the index of this number is "+linear(arr,x));
    }
  
}

