import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MedianOfStream {
    static PriorityQueue<Integer> max=new PriorityQueue<>(Collections.reverseOrder());
        static PriorityQueue<Integer> min=new PriorityQueue<>();
    public static void main(String[] args) {
        int[] arr = new int[]{5, 2,15,10,20, 3,1};
        
        max.add(arr[0]);
        double med=arr[0];
        System.out.println(arr[0]);
        for(int i=1;i<arr.length;i++)
        {
            int x = arr[i];
             
            // case1(left side heap has more elements) 
            if(max.size() > min.size())
            {
                if(x < max.peek())
                {
                    min.add(max.remove());
                    max.add(x);
                }
                else
                    min.add(x);
                med = (double)(max.peek() + min.peek())/2;
            }
             
            // case2(both heaps are balanced) 
            else if(max.size() == min.size())
            {
                if(x < max.peek())
                {
                    max.add(x);
                    //med = (double)smaller.peek();
                }
                else
                {
                    min.add(x);
                    med = (double)min.peek();
                }
            }
             
            // case3(right side heap has more elements) 
            else
            {
                if(x > max.peek())
                {
                    max.add(min.remove());
                    min.add(x);
                }
                else
                    max.add(x);
                med = (double)(max.peek() + min.peek())/2;
                 
            }
           System.out.println(med);
        }
    }
           
    

    // private static double findMedian() {
    //   if(max.size()==min.size())
    //   {
    //     return (max.peek()+min.peek())/2;
    //   }
    //   else
    //     return max.peek();
    // }
    
}
