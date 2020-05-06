import java.util.Scanner;

public class LeapYear {
    public static boolean IsLeapYear(int year)
    {
        boolean result=false;
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
        {
            result=true;
                    }
        else
            result= false;
      return result;
    }

    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int year=scan.nextInt();
        System.out.println(IsLeapYear(year));
    }
}
