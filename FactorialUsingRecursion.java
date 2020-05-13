import java.util.Scanner;

public class FactorialUsingRecursion {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

       System.out.println(Fact(n));
    }

    public static int Fact(int n) {
        if (n < 0) {
            return n * Fact(n - 1);

        } else {
            return 1;
        }

    }

}
