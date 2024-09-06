
public class RearrageNegativePositiveNum {
public static void main(String[] args) {
    int arr[]={-12, 11, -13, -5, 6, -7, 5, -3, -6};//-12,-13,-5,-7,-3,-6,11,6,5
    int count=0;
    int[] temp=new int[arr.length];
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]<0){
           temp[count]=arr[i];
           count++;
        }
    }
    System.out.println(count);
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]>=0){
        temp[count]=arr[i];
        count++;
        }
    }
    System.out.println(count);

    for(int i=0;i<temp.length;i++)
    {
        System.out.print(temp[i]+" ");
    }
}
}
