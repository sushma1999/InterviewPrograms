import java.util.Scanner;

public class IntegerPalindrome {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        IsPalindrome(n);
    }

    // 101
    public static void IsPalindrome(int n) {
        int reversed = 0;
        int Original = n;
        while (n != 0) {
            int remainder = n % 10;
            n = n / 10;
            reversed = reversed * 10 + remainder;
        }
        if (Original ==reversed)
        {
            System.out.print("Yes , It is a palindrome");
        }
        else {
            System.out.print("No, It is not a palindrome");

        }
    }
}

