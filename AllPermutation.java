public class AllPermutation {
    public static void main(String[] args) {
        String str="abc";
        permute(str,0,str.length());
    }

    private static void permute(String str, int l, int r) {
        if(l==r){
            System.out.println(str);
            return;
        }
        for(int i=l;i<r;i++)
        {
           str= swap(str,i,l);//swap charcters
            permute(str, l+1, r);
          str=  swap(str,i,l);//make the original string after swaping once again
        }
    }

    private static String swap(String str, int i, int l) {
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(i, str.charAt(l));
        sb.setCharAt(l, str.charAt(i));
        return sb.toString();

    }
}
