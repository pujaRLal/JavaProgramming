import java.util.Arrays;

public class AllZeroInOne {
    public static void main(String[] args) {
        int arr[]={1,2,3,0,0,4,1,7,0};
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            
                arr[count++]=arr[i];
        }
        while(arr.length-count>0)
        {
            arr[count++]=0;
        }
        System.out.print(Arrays.toString(arr));
    }
    
}
