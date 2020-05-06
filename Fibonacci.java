import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int fibo1=0;
        int fibo2=1;
        int sum;
        for(int i=1;i<=n;i++)
        {
            System.out.print(fibo1+" ");
            sum=fibo1+fibo2;
            fibo1=fibo2;
            fibo2=sum;
        }

    }
}