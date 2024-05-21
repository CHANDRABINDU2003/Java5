public class BubbleSort{
    static void bubble(int []arr){
        int n=arr.length;
        int temp=0;
        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++){
                if(arr[j-1]>arr[j]){
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    
                }
                
            }
        }
    }

    public static void main(String[] args) {
       int arr[]={4,8,1,0,12};
        System.out.println("before sorting");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        bubble(arr);
        System.out.println("");
        System.out.println("after sorting");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }

}