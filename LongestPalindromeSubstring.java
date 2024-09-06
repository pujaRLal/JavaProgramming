public class LongestPalindromeSubstring {
    static int resultStart;
    static int resultLength;

    public static void main(String[] args) {
        String str="abscsabcdcballl";
      String result=  logestPalindrome(str);
      System.out.println(result);
    }

    private static String logestPalindrome(String str) {
       for(int start=0;start<str.length()-1;start++)
       {
        expandRange(str,start,start);//odd
        expandRange(str,start,start+1);//even

       }
       return str.substring(resultStart,resultStart+resultLength);
    }

    private static void expandRange(String str, int begin, int end) {
       while(begin>=0 && end <str.length() && str.charAt(begin)==str.charAt(end))
       {
        begin--;
        end++;
       }
       if(resultLength<end-begin-1)
       {
        resultStart=begin+1;
        resultLength=end-begin-1;
       }
    }
}
