import java.util.Scanner;
import java.util.*;

public class IntergerPalindrome
{
    public static boolean CheckIfPalindrome(int no)
    {
        int reversed=0,orignialNo=no;
        int remainder;
        while(no!=0)
        {
            remainder=no%10;
            no=no/10;
            reversed=reversed*10+remainder;
        }
        return orignialNo==reversed;
    }
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        int no=scan.nextInt();
       System.out.print(CheckIfPalindrome(no));
    }
}
