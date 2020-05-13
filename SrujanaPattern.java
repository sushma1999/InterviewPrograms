import java.util.Scanner;

public class SrujanaPattern {

    public static void myPattern(int n) {
        for (int i = n; i > 0; i--) {
            int temp = n;
            for (int j = i; j <= n; j++) {
                System.out.print(temp + " ");
                temp--;
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        myPattern(n);
    }
}
