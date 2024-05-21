
public class BinarySearch {
    public static int binary(int arr[],int i){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
        int mid=(low+high)/2;
        int mi=arr[mid];
        if(i==mi){
            return mid;}
        if(i<mi){
            high=mid-1;
        }
        else{
            low=mid+1;
        }
        }
        return -1;
    }
    public static void main(String[] args) {
    int arr[]={2,3,4,5,6,7,8,9};
int x=8;
        System.out.println("index is "+binary(arr,x));
    }
}
   


   
