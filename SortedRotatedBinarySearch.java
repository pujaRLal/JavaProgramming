public class SortedRotatedBinarySearch {
    public static void main(String[] args) {
        int arr[]= {50, 10, 20, 30, 40};
        int  key = 60;
       int index= binarySearch(arr,0,arr.length-1,key);
       System.out.println(index);
    }

    private static int binarySearch(int[] arr, int low, int high, int key) {
       while(low<=high)
       {
        int mid=low+(high-low)/2;
        if(arr[mid]==key)
            return mid+1;
        if(arr[low]<=arr[mid]) //left part sorted
        {
            if(key>arr[low] && key<arr[mid])
                high=mid-1;
            else
                low=mid+1;
        }
        else
        {
            if(key>arr[mid] && key < arr[high])
            {
                low=mid+1;
            }
            else
                high=mid-1;
        }
       }
    return -1;
    }
}
