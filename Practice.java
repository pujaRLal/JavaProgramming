import java.util.*;
public class Practice {
	public static void main(String[] args) {
        int arr[]={-1,0,1,2,-1,-4};
        Arrays.sort(arr);
        int sum=0;
        List<List<Integer>> list=new ArrayList<>();
       list= triplet(arr,sum);
       System.out.println(list);
  }
                   
      private static List<List<Integer>> triplet(int[] arr, int x) {
        List<List<Integer>> list=new ArrayList<>();

        int n=arr.length;
        for(int i=0;i<arr.length;i++)
        {
            int left=i+1;
            int right=n-1;
            while(left<right)
            {
                int sum=arr[i]+arr[left]+arr[right];
                if(sum<x)
                    left++;
                else if(sum>x)
                    right--;
                else
                {
                    ArrayList<Integer> alist=new ArrayList<>();
                    alist.add(arr[i]);
                    alist.add(arr[left]);
                    alist.add(arr[right]);
                    left++;
                    right--;
                    if(!list.contains(alist))
                    list.add(alist);
                }

            }
          } 
          return list;  
  
        }
      }
