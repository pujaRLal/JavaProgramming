public class MergeSort {
    public static void main(String[] args) {
        int arr[]={4,3,6,2,7,6,9,8,1};
        mergeSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    private static void mergeSort(int[] arr, int l, int h) {
        if(l<h)
        {
            int mid=l+(h-l)/2;
           // System.out.print(mid+" ");
            mergeSort(arr,l,mid);
            mergeSort(arr, mid+1, h);
            merge(arr,l,mid,h);

        }
       
    }

    private static void merge(int[] arr, int l, int mid, int h) {
        int n1=mid-l+1;
        int n2=h-mid;
       int left[]=new int[n1];
       int right[]=new int[n2];
       for(int i=0;i<n1;i++)
       {
        left[i]=arr[l+i];
       }
       for(int j=0;j<n2;j++)
       {
        right[j]=arr[mid+1+j];
       }
       int i=0,j=0,k=l;
       while(i<n1 && j<n2)
       {
        if(left[i]<=right[j])
        {
            arr[k++]=left[i++];
        }
        else if(left[i]>right[j])
        {
            arr[k++]=right[j++];
        }
       }
       while(i<n1)
       {
        arr[k++]=left[i++];
       }
       while(j<n2)
       {
        arr[k++]=right[j++];
       }


    }
}
