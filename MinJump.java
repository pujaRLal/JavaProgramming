public class MinJump {
    public static void main(String[] args) {
        int arr[]={1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        int pos=0,des=0,jump=0;
        for(int i=0;i<arr.length-1;i++)
        {
            des=Math.max(des,arr[i]+i);
            if(pos==i)
            {
                pos=des;
                jump++;
            }
        }
        System.out.println("minimum no if jump is  "+jump);
    
    }
    
}
