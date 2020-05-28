import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();

        FindFibo(n);
    }
    public static void FindFibo(int n)
    {
        int fibo1= 0 ;
        int fibo2= 1;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            System.out.print(fibo1+ " ");
            sum=fibo1+fibo2;
            fibo1= fibo2;
            fibo2=sum;
        }


// 0 1 1 2 3 5
    }
}
