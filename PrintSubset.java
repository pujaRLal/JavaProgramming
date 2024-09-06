public class PrintSubset {
    public static void main(String[] args) {
        String str = "abc"; 
        int index = 0; 
        String curr = ""; 
        powerSet(str, index, curr); 
    }

    private static void powerSet(String str, int index, String s) {
        if(index==str.length())
        {
            System.out.println(s);
            return;
        }

        powerSet(str, index+1, s+str.charAt(index));
        powerSet(str, index+1, s);
    }
}
