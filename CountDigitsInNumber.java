

import java.util.*;
        import java.io.*;

class CountDigitsInNumber {


    public static void main(String[] args)
    {
        Scanner scan =new Scanner(System.in);
        long n=scan.nextLong();
        int count = 0;

        if (n!=0)
        {
            do
            {
                n = n / 10;
                count++;
            }while (n!=0);

        }
        System.out.print(count);
    }
}