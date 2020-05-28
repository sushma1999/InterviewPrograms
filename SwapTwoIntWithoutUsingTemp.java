import java.util.Scanner;

public class SwapTwoIntWithoutUsingTemp {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b= scan.nextInt();
        System.out.println(a+" "+b);

        a= a+b;
        b=a-b;
        a=a-b;

        System.out.println(a+" "+b);
    }
}
