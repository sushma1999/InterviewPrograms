import java.util.Scanner;

public class FibonacciRecursion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(




                    (i) + " ");
        }
    }

    public static int FiboRecursion(int n) {
        if ((n == 0) || (n == 1))
            return n;
        if (n > 1) {
            return FiboRecursion(n - 2) + FiboRecursion(n - 1);
        }
        return -1;
    }
}
