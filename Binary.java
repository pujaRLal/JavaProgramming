import java.util.Arrays;

public class Binary {
    public static void main(String[] args) {
        int arr[]={2,3,7,8,9,10,13,15};
    Arrays.sort(arr);//2,3,7,8,9------------222 2 222  5
    int n=arr.length-1;//4
    int ele=15;
    int x=searchele(arr,0,n, ele);
    System.out.println(x);
    }

    private static int searchele(int[] arr, int low,int high, int ele) {
        while(low<=high)
    {
        int mid=low+(high-low)/2;
        if(arr[mid]==ele)
	    return mid;
        else if(arr[mid]<ele)
        {
	        low=mid+1;
        }
            else
	        high=mid-1;
     }

        return -1;
       
    }
    
}
