import java.util.HashMap;

public class LargesSubstringInString {
    public static void main(String[] args) {
        String str="GoodMorningabcdefhij";
        String subString="";
        int length=0,existingLength=0;
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            if(!hm.containsKey(str.charAt(i)))
                hm.put(str.charAt(i),1);
            
            else{
                existingLength=i-length;
                 if(existingLength>length)
                 {
                 subString = str.substring(length,i);
                 length=existingLength;
                 }
            }
        }
        System.out.println(subString);
    }
    
}
