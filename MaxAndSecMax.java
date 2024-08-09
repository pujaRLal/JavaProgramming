import java.util.Arrays;
import java.util.Comparator;

public class MaxAndSecMax {
    public static void main(String[] args) {
        int arr[]={3,8,4,5,6,7};
        //max
        Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).findFirst().ifPresent(System.out::println);

        //secmax
        Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().ifPresent(System.out::println);

        //ThirdMax
        Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).limit(3).skip(2).forEach(System.out::println);
        //skip(1).findFirst().ifPresent(System.out::println);




    }
}
