import java.util.Scanner;

public class InvertedPyramid {

    public static void StarPattern(int n)
    {
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=n-i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();

        StarPattern(n);
    }
}

