import java.util.Scanner;

public class Recursion1 {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int n= scan.nextInt();

        ReduceBy1(n);
    }

    public static void ReduceBy1(int n)
    {
        if(n>0)
        {
            ReduceBy1(n-1);

        }
           System.out.println("Current value is " +n+ " ");

    }
}
