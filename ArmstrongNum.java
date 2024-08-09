import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("print the number:");
        int num=sc.nextInt();
        sc.close();
        int r=0,sum=0;
        int n=num;
        while(num!=0)//1231
        {
            r=num%10;
            sum=sum+r*r*r;
            num=num/10;
        }
        System.out.println(sum);

        if(sum==n)
        System.out.println("armstrong");
        else
        System.out.println("not armstrong");

    }
}
