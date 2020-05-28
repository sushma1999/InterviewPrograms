import java.util.Scanner;

public class ReverseANumber {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num= scan.nextInt();
        int remainder;
        while(num!=0)
        {
            remainder=num%10;
            num=num/10;
            System.out.print(remainder);
        }
    }
}
