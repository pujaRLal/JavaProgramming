import java.util.Arrays;

public class AllPermutationOfArray {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        permute(arr,0,arr.length-1);

    }

    private static void permute(int[] arr, int l, int r) {
        if(l==r){
            System.out.println(Arrays.toString(arr));
            return;
        }
        for(int i=l;i<=r;i++)
        {
           swap(arr,i,l);
           permute(arr, l+1, r);
           swap(arr,i,l);

        }
    }

    private static void swap(int[] arr, int i, int l) {
        int temp=arr[i];
        arr[i]=arr[l];
        arr[l]=temp;
    }
}
