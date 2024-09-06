import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.*;

public class GroupAnagram {
    public static void main(String[] args) {
        String arr[] = {"eat","tea","tan","ate","nat","bat"};

        // Group anagrams using a Map
        Map<String, List<String>> groupedAnagrams = Arrays.stream(arr)
            .collect(Collectors.groupingBy(
                str -> {
                    char[] chars = str.toCharArray(); // Convert string to char array
                    Arrays.sort(chars);               // Sort the char array
                    return new String(chars);         // Convert back to string as key
                }
            ));

        // Print the grouped anagrams
        groupedAnagrams.forEach((key, value) -> System.out.println(value));

    }
}
