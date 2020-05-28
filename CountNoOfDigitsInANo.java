import java.util.Scanner;

public class CountNoOfDigitsInANo {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int count=0;
         int no= scan.nextInt();
         while (no!=0)
         {
             no=no/10;
             count++;
         }
         System.out.println(count);
    }
}
