import java.util.Arrays;

public class Practice2 {


    public static void main(String[] args) {
        int[] a = {-1, 2, 1, 4, -2, -6};
        rearrangeArrayInPlace(a);
        System.out.println(Arrays.toString(a));
    }

    private static void rearrangeArrayInPlace(int[] a) {
        int n = a.length;
        int i = 0, j = 0;

        // Move all positive numbers to the front
        while (j < n) {
            if (a[j] >= 0) {
                swap(a, i, j);
                i++;
            }
            j++;
        }

        // Now 'i' is at the first negative number
        int posIndex = 0, negIndex = i;

        // Alternate rearrangement of positive and negative numbers
        while (posIndex < negIndex && negIndex < n && a[posIndex] >= 0) {
            swap(a, negIndex, posIndex);
            posIndex += 2; // Move to the next positive index
            negIndex++; // Move to the next negative index
        }
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}

