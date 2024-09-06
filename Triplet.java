
import java.util.*;
public class Triplet {
    public static void main(String[] args) {
        int sum=13;
        int arr[] = {4,5,7,6,9};
        Arrays.sort(arr);
       boolean ans= findTriplet(arr,arr.length,sum);
       System.out.println(ans);
       
    }

    private static boolean findTriplet(int[] arr, int n, int sum) {
        for(int i=0;i<n-2;i++)
        {
            HashSet<Integer> hs=new HashSet<>();
            int toFind=sum-arr[i];
            for(int j=i+1;j<n;j++)
            {
                if(hs.contains(toFind-arr[j]))
                {
                return true;
                }
                else
                    hs.add(arr[j]);
            }
           
        }
        return false;
        
    }    
}
