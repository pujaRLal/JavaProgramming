import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Isomorphic {
    public static void main(String[] args) {
        String s1="egabc";
        String s2="adepq";
      List<Long> l1= s1.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().
      stream().map(a->a.getValue()).collect(Collectors.toList());
      List<Long> l2= s2.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().
      stream().map(a->a.getValue()).collect(Collectors.toList());
      
       if(l1.equals(l2))
       System.out.println("Isomorphic");
       else
       System.out.println("Not Isomorphic");



    }
    
}
