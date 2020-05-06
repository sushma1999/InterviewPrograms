import java.util.Scanner;

public class Factorial {
    public static int factorial(int no)
    {int fact=1;
        for(int i=1;i<=no;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        System.out.print(factorial(n));
    }
}
