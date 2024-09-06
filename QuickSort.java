public class QuickSort {
    public static void main(String[] args) {
        
        int arr[] = {2, 5, 3, 8, 6, 9, 1};
        int l = 0;
        int h = arr.length - 1;

        quickSort(arr, l, h);

        // Print the sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    private static void quickSort(int[] arr, int l, int h) {
        if(l<h){
            //lomuto
            int p=partition(arr,l,h);
            System.out.println("partition is :"+p);

            quickSort(arr,l,p-1);
            quickSort(arr,p+1,h);
        }
    }

    private static int partition(int[] arr, int l, int h) {
        //lomuto
      int pivot=arr[h];
       int i=l-1;
       for(int j=l;j<h;j++)
       {
        if(arr[j]<pivot)
        {
            i++;
            swap(arr,i,j);
        }
        
       }
       swap(arr, i+1,h);
    return i+1;

       
    }

    private static void swap(int[] arr, int i, int j) {
       int temp=arr[i];
       arr[i]=arr[j];
       arr[j]=temp;
    }
    
}
