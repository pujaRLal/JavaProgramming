import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quardublets {
    public static void main(String[] args) {
        int arr[]={4, 1, 2, -1, 1, -3};
        Arrays.sort(arr);
        int target=1;
        List<List<Integer>> list=quardublets(arr,arr.length,target);
        System.out.println(list);
    }

    private static List<List<Integer>> quardublets(int[] arr, int n,int target) {
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int left=j+1;
                int right=n-1;
                while(left<right)
                {
                    if(arr[i]+arr[j]+arr[left]+arr[right]==target)
                    {
                        List<Integer> l1=new ArrayList<>();
                        l1.add(arr[i]);l1.add(arr[j]); l1.add(arr[left]); l1.add(arr[right]);
                        res.add(l1);
                        int leftval=arr[left];
                        while(left<n && arr[left]==leftval){
                            left++;
                        }
                        int rightval=arr[right];
                        while(right>left && arr[right]==rightval)
                               {
                                right--;
                               }
                    }
                    else if(arr[i]+arr[j]+arr[left]+arr[right]<target)
                        left++;
                    else
                        right--;
                }
                while(j+1<n && arr[j+1]==arr[j])
                {
                    j++;
                }
            }
            while(i+1<n && arr[i+1]==arr[i])
            {
                i++;
            }
        }
        return res;
        
    }
}
