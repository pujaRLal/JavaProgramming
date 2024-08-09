import java.util.Arrays;

public class MinimumPlatform {
    public static void main(String[] args) {
        int a[]={900,940,950,1100,1500,1800};
        int d[]={910,1200,1120,1130,1900,2000};
        int ans= findPlatform(a,d,a.length-1);
        System.out.println(ans);
    }

    private static int findPlatform(int[] a, int[] d, int n) {
        Arrays.sort(a);
        Arrays.sort(d);
        int i=0,j=0,count=0,max=0;
        while(i<n)
        {
            if(a[i]<=d[j])
            {
                count++;
                max=Math.max(count,max);
                i++;
            }
            else if(a[i]>d[j])
            {
                count--;
                j++;
            }
        }
        return max;
    }
}
