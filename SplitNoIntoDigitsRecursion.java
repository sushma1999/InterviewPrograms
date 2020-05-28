import java.util.Scanner;

public class SplitNoIntoDigitsRecursion {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num= scan.nextInt();

        split(num);

    }

    public static void split(int num)
    {

        if (num>0) {

            split(num/10);
            System.out.print(num%10 + ",");
        }

    }

}
