public class InsertionSort{
    static void insert(int []arr){
        for(int i=0;i<arr.length;i++){
            int current= arr[i];
            int j=i-1;
            while(j>=0&& arr[j]>current){
                arr[j+1]=arr[j];
                j--;
                
            }
            arr[j+1]=current;
        }
    }
    public static void main(String[] args) {
        int arr[]={3,1,2,6,4,8};
        System.out.println("before sorting");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println("");
        insert(arr);
        System.out.println("after sorting");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        
    }
}