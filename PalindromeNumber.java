import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("print the number:");
        int num=sc.nextInt();
        sc.close();
        int r=0;
        while(num!=0)
        {
             r=num%10+r*10;
            num=num/10;
        }
        System.out.println(r);
        if(num==r)
        System.out.println("true");
        else
        System.out.println("false");


    }
}
