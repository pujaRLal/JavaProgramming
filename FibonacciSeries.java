import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("print the number:");
        int num=sc.nextInt();
        sc.close();
        for(int i=0;i<num;i++)
        {
            System.out.println(fibo(i));
        }

    }

    static int fibo(int n)
    {
        if(n==0)
        return 0;
        if(n==1)
        return 1;
        else
            return fibo(n-1)+fibo(n-2);
    }


}
