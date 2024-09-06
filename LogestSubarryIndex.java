import java.util.*;

public class LogestSubarryIndex {
    public static void main(String[] args) {
        int arr[] = {1,2,3,7,5};
        int sum = 12;
        int presum=0;
        int maxlen=0;
        HashMap<Integer,Integer> hm= new HashMap<>();
        ArrayList<Integer> alist=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            presum+=arr[i];
            if(presum==sum)
            maxlen=i;
            
            if(!hm.containsKey(presum))
            hm.put(presum,i);
            
            if(hm.containsKey(presum-sum))
            {
                int subarray=i-hm.get(presum-sum);
                System.out.println(Math.max(maxlen, subarray));
                break;
             }    
    
        }
    }
}   
