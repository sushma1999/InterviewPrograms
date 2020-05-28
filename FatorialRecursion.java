import java.util.Scanner;

public class FatorialRecursion {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int no = scan.nextInt();
        int result=Factorial(no);
        System.out.println(result);
    }
    public static int Factorial(int no)
    {

        if(no==0)
        {
            return 1;
        } else {
           return no * Factorial(no - 1);
        }

    }
}
