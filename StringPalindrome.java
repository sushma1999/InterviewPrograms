import java.util.Arrays;
import java.util.Scanner;

public class StringPalindrome {

    public static boolean IsPalindrome(String input)
    {
        int len=input.length();
        char[] myArray=new char[len];
        boolean isPal=false;
        myArray=input.toCharArray();
        for(int i=0;i<len;i++)
        {
            if(myArray[i]==myArray[len-i-1])
            {
                isPal=true;
            }
            else
            {
                isPal=false;
            }
        }
        return isPal;
    }

    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String input= scan.nextLine();

       var Output= IsPalindrome(input);
    System.out.print(Output);
    }
}
