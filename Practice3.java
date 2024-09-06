import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Practice3 {
    public static void main(String[] args) {
        String str="test";
      Optional<Character> x = str.chars().mapToObj(c->(char)c).collect
      (Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                        .entrySet().stream().filter(a->a.getValue()==1).map(a->a.getKey()).findFirst();
                    
        if(x.isPresent())
        {
            System.out.println(x.get());
        }
    }
    
}
