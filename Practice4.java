import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Practice4 {
    public static void main(String[] args) {
        String str="hii pooja howwww are you";
        //hI pUja hOw aRe yOu?
        //capitalize the 2nd char of each word
       String res= Arrays.stream(str.split(" ")).map(a->{
            if(a.length()>1)
            {
                return a.substring(0, 1)+a.substring(1,2).toUpperCase()+a.substring(2,a.length());
            }
            else
                return a;
        }).collect(Collectors.joining(" "));

        System.out.println(res);

        //Capitalize the Last Character of Each Word:

      String res1=  Arrays.stream(str.split(" ")).map(b->{
            if(b.length()>1)
            return b.substring(0, b.length()-1)+b.substring(b.length()-1, b.length()).toUpperCase();
            else
                return b.toUpperCase();


        }).collect(Collectors.joining(" "));
        System.out.println(res1);

        //Reverse Each Word in the String:

      String res2=  Arrays.stream(str.split(" ")).map(a->{
           String result="";
            for(int i=0;i<a.length();i++)
            {
                result=a.charAt(i)+result;
            }
            return result;
        }).collect(Collectors.joining(" "));

        System.out.println(res2);

        //Replace Vowels with *:

     String res3=   Arrays.stream(str.split(" ")).map(c->{
            //c.toLowerCase();
            for(int i=0;i<c.length();i++){
            if(c.charAt(i)=='a' || c.charAt(i)=='e' || c.charAt(i)=='i' || c.charAt(i)=='o' || c.charAt(i)=='u')
            {
              c=  c.replace(c.charAt(i), '*');
            }
        }
            return c;
        }).collect(Collectors.joining(" "));
        System.out.println(res3);

        //Capitalize the First and Last Character of Each Word:

       String res4= Arrays.stream(str.split(" ")).map(d->{
            return d.substring(0,1).toUpperCase()+d.substring(1, d.length()-1)+d.substring(d.length()-1, d.length()).toUpperCase();
        }).collect(Collectors.joining(" "));
        System.out.println(res4);

        //Problem: Given a string, remove all duplicate characters from each word in the string.

        String result = Arrays.stream(str.split(" "))
            .map(word -> removeDuplicateCharacters(word))
            .collect(Collectors.joining(" "));

        System.out.println(result);

            //Sort Characters of Each Word Alphabetically:



       String res6= Arrays.stream(str.split(" "))
        .map(a->{
            return Arrays.stream(a.split("")).sorted().collect(Collectors.joining(""));
        }).
        collect(Collectors.joining(" "));

        System.out.println(res6);

        //Replace the First Character of Each Word with #:
        String res7=  Arrays.stream(str.split(" "))
        .map(a->{
            return a.replace(a.charAt(0), '#');
        }).collect(Collectors.joining(" "));
        System.out.println(res7);

    




        

    }


    private static String removeDuplicateCharacters(String word) {
        Set<Character> seen = new LinkedHashSet<>();
        for (char c : word.toCharArray()) {
            seen.add(c);
        }
        return seen.stream()
                   .map(String::valueOf)
                   .collect(Collectors.joining());
    }















 
 
    }
    

