public class LengthOfSmallestSubarray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 10, 4, 2, 3, 5};
        int left=0;
        int n= arr.length;
        int right=arr.length-1;

        while(left<right && arr[left]<=arr[left+1])
        {
            left++;
        }
        if(left==n-1)
        {
            System.out.print(0);
        }
        while(right>left && arr[right]>arr[right-1]){
            right--;
        }
        int mincount=Math.min(n-left-1,right);
        int j=right;
        for(int i=0;i<left+1;i++)
        {
            if(arr[i]<=arr[j])
            {
                mincount=Math.min(mincount,j-i-1);
            }
            else if(j<n-1)
                j++;
            else
                break;    
        }
        System.out.println(mincount);

    }
    
}
