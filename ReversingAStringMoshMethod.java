import java.util.Scanner;

public class ReversingAStringMoshMethod {
    public static String reverse(String str) {
        if (str == null)
            return "";

        StringBuilder reversed = new StringBuilder();
        for (var i = str.length() - 1; i >= 0; i--)
            reversed.append(str.charAt(i));

        return reversed.toString();
    }
    public static void main(String[] args)
    {
        Scanner scan =new Scanner(System.in);
        String input= scan.nextLine();
        System.out.println(reverse(input));

    }

}

