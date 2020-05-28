import java.util.Scanner;

public class CheckTheNoIsPalindromeOrNot {

    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int no = scan.nextInt();
         int actual= no;
         int remainder,reversed=0;
        while(no!=0)
        {
            remainder=no%10;
            no=no/10;
            reversed=reversed*10+remainder;
        }
        if(actual==reversed)
        {
            System.out.print("Palindrome");
        }else{
            System.out.print("Not Palindrome");
        }
    }
}
