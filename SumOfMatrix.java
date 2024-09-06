public class SumOfMatrix {
    public static void main(String[] args) {
      int arr[]= {8, 4, 9, 3};
      int temp[]=new int[arr.length];//output= 63, 51, 0, 0
      int smallSum=0,largeSum=0;
      for(int i=0;i<arr.length;i++)
      {
        for(int j=0;j<arr.length;j++)
        {
            if(arr[i]>arr[j])
                smallSum+=arr[j];
            else if(arr[i]<arr[j])
                largeSum+=arr[j];
        }
        temp[i]=smallSum*largeSum;
        smallSum=0;
        largeSum=0;


      }
      for(int i=0;i<arr.length;i++)
      {
        System.out.println(temp[i]);
      }
    }
    
}
