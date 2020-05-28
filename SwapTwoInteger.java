import java.util.Scanner;

public class SwapTwoInteger {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b= scan.nextInt();
        System.out.println(a+" "+b);

        int temp;
        temp = a;
        a=b;
        b= temp ;

        System.out.println(a+" "+b);

    }
}
