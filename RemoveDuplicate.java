import java.util.*;
import java.util.stream.*;
import java.util.function.*;


public class RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(2,3,2,4,5,6,3,7,9,8,3);
      List<Integer> l1=  list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                                .entrySet().stream().filter(a->a.getValue()==1).map(a->a.getKey()).collect(Collectors.toList());
                                for(Integer l2:l1)
                                {
                                    System.out.print(l2+" ");
                                }
	}

    
}



