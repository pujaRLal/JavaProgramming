public class BinarySerch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int search=9;
      int index=  searchElement(arr,arr.length,search);
      System.out.println("element found at index "+index);
    }

    private static int searchElement(int[] arr, int n, int search) {
       int low=0;
       int high=n-1;
       while(low<=high)
       {
        int mid=(low+high)/2;
        if(arr[mid]<search)
            low=mid+1;
        else if(arr[mid]>search)
            high=mid-1;
         else
            return mid+1;   
       }
    return -1;
    }
    
}
