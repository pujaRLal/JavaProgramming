public class ContigeousSubarry {
    public static void main(String[] args) {
        int arr[]={2,3,4,6,5,9,3,0,0,1};
        int sum=13;
        int presum=0;
        int i=0,j=0;
        while(i<arr.length)
        {
            presum+=arr[i++];
        if(presum>sum)
          {
            j++;
            i=j;
            presum=0;
          }  
         else if(presum==sum)
         {
            for(int k=j;k<i;k++)
            {
                System.out.print(arr[k]+" ");
            }
            break;
         } 
    
    }
    }
    
}
