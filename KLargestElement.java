import java.util.PriorityQueue;

public class KLargestElement {
    public static void main(String[] args) {

    int arr[]={2,3,1,5,7,9,8,6,11};
    int k=3,n=arr.length;
    PriorityQueue<Integer> pq=new PriorityQueue<>(k);
    for(int i=0;i<n;++i)
    {
        pq.add(arr[i]);
        if(pq.size()>3)
        pq.poll();
    }
    // while(!pq.isEmpty())
    // {
    //     System.out.println(pq.peek());
    //     pq.poll();
    // }
             System.out.println(pq.peek());


} 
}
