import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int year=scan.nextInt();
        Leap(year);

    }

    public static void Leap(int year)
    {
        if(year%4==0 && year%100!=0 || year%400==0  )
        {
            System.out.println("Leap Year");
        }
        else
        {
            System.out.println("Not a leap Year");
        }
    }
}
