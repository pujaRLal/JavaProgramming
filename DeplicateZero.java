import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DeplicateZero {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            arr[count++]=arr[i];
            if(arr[i]==0)
            {
                arr[count++]=0;
                i++;

            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}