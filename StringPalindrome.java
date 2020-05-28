import java.util.Scanner;

public class StringPalindrome {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String input = scan.nextLine();

        System.out.print(IsStringPalindrome(input));

    }

    public static boolean IsStringPalindrome(String MyString) {

        int len = MyString.length();
        boolean isPal = false;
        char[] CArray = MyString.toCharArray();
        for (int i = 0; i < len; i++) {
            if (CArray[i] == CArray[len - i - 1]) {
                isPal = true;
            } else {
                isPal = false;
                return false;
            }
        }
        return isPal;
    }
}
