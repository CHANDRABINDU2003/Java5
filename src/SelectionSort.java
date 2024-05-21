public class SelectionSort{
    static void select(int []arr){
        int n=arr.length;
        int temp=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[i]){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
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
        select(arr);
        System.out.println("");
        System.out.println("after sorting");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
        
    }
