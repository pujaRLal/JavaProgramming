import java.util.*;


public class TripletSum {
    public static void main(String[] args) {
       int arr[]= {12, 3, 4, 1, -1,1, 9,9};
       int sum = 4; 
       int n= arr.length;
       List<List<Integer>> output=new ArrayList<>();
       for(int i=0;i<n;i++)
       {
        int left=i+1;
        int right=n-1;
        while(left<right)
        {
            if(arr[i]+arr[left]+arr[right]==sum)
            {
                List<Integer> list=new ArrayList<>();
                list.add(arr[i]);
                list.add(arr[left]);
                list.add(arr[right]);
                output.add(list);
                left++;
                right--;

            }
           else if(arr[i]+arr[left]+arr[right]<sum)
            left++;
            else
                right--;
        }
       }
       System.out.println(output);

    }
}
