
public class PowersetArray {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        powerSet(arr,0,"");
    }

    private static void powerSet(int[] arr, int index, String curr) {
        if (index == arr.length) {
            System.out.println(curr);
            return;
        }

        powerSet(arr, index + 1, curr + arr[index] + " ");
        powerSet(arr, index + 1, curr);
    }
}
