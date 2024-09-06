import java.util.HashMap;

public class LongestSubStringWithoutRepeatingChar {
    public static void main(String[] args) {
        String str = "pwwkew";
        int count=0;
        int len=0;
        HashMap<Character,Integer> hm= new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            if(!hm.containsKey(str.charAt(i)))
            {
                hm.put(str.charAt(i),1);
                len++;

            }

           else{
            count=Math.max(count,len);
            hm.clear();
            len=0;
            hm.put(str.charAt(i),1);
            len++;
           }
        }
        System.out.println(count);

    }
    
}
