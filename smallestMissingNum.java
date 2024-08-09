
import java.util.*;
import java.util.stream.*;
public class smallestMissingNum {
    public static void main(String[] args) {
int arr[]={0,1,5,4,3,2,6,7,9};
Arrays.sort(arr);
Set<Integer> set=Arrays.stream(arr).boxed().collect(Collectors.toSet());
System.out.println(IntStream.range(0, arr.length+1).filter(a->!set.contains(a)).findFirst().orElse(arr.length));
    }
}
