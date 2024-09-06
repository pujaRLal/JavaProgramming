public class IncresingTriplet {
    public static void main(String[] args) {
        int arr[] = {2,1,5,0,4,6};
        int count=0;
        int i=0;
        while(i<arr.length-2)        {
            if(arr[i]<arr[i+1] && arr[i+1]<arr[i+2])
            {
                System.out.println("First "+ i+" Sec " +(i+1)+" third  "+(i+2));
                break;
            }
            else
                i++;
        }

    }
}
