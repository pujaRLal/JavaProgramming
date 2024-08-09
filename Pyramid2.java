public class Pyramid2 {
    public static void main(String[] args) {
for(int i=1;i<=8;i=i+2)
{
    for(int j=7;j>=i;j--)
    {
        System.out.print(" ");
    }
    for(int j=1;j<=i;j++)
    {
        System.out.print("* ");
    }
    System.out.println();
}
    }
}
