import java.util.Scanner;

public class StringPalindrome {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("print the string:");
        String str=sc.next();
        String res="";
        sc.close();
            for(int i=0;i<str.length();i++)
            {
                res=str.charAt(i)+res;
            }
            System.out.println(res);

            if(str.equals(res))
        System.out.println("true");
        else
        System.out.println("false");

        }

    
}
