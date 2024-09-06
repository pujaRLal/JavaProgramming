public class PalindromeUsingRecursion {
    public static void main(String[] args) {
        String str="abcbad";
        boolean ans=palindrome(str,0,str.length()-1);
        System.out.println(ans);
    }

    private static boolean palindrome(String str, int i, int j) {
        if(i>=j)
        return true;
        
        if(str.charAt(i)!=str.charAt(j))
        return false;
        
        return palindrome(str, i+1, j-1);
    }
}
