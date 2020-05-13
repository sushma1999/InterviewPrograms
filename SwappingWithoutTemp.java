import java.util.Scanner;

public class SwappingWithoutTemp {

    public static void Swapping(int a,int b)
    {
        //10 ..,, 15

        a=a+b;
        b=a-b;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        Swapping(a,b);
    }
}
