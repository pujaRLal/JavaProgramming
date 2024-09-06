import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Practice5 {
    public static void main(String[] args) {
        //Suppose you have a list of strings representing numbers, and you want to find the square of the sum of the even numbers.

    List<String> numberStrings = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");

   IntStream x = numberStrings.stream().mapToInt(Integer::parseInt);
   System.out.println( x.boxed().filter(a->a%2==0).mapToInt(a->a*a).sum());

    }
}
