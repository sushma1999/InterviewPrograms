import java.util.Scanner;

public class AlphabetPattern {

    public static void AlphabetsPattern(int n)
    {
        int AlpanumericNo =65;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print((char)AlpanumericNo);
            }
            AlpanumericNo++;
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();

        AlphabetsPattern(n);
    }
}
