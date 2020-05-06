import java.util.*;
import java.io.*;
class ReverseNumber{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int given=sc.nextInt();
        int original = given;
        int reversed = 0;
       while (given!=0){
           int temp = given%10;
           reversed = reversed*10 + temp;
           given=given/10;
       }

       System.out.println("The given number is " + original + " Reversed number is " + reversed );
    }
}