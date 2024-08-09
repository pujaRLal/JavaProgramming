public class EquilibriumPoint {
    public static void main(String[] args) {
        int arr[]={1,3,5,2,2};
        int sum=0,sum2=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];//13
        }
        for(int i=arr.length-1;i>=0;i--)
        {
            sum=sum-arr[i];
            if(sum2==sum)
            {
                System.out.println(i+1);
                break;
            }
            sum2=sum2+arr[i];            
        }
    }
}
