import java.util.Scanner;

public class PatternZeroOne {

    public static void ZeroOne(int n) {
        for (int i = 1; i <= n; i++) {
            int num = 0;
            for (int j = 1; j <= n; j++) {
                if (i % 2 != 0) {
                    num = num == 0 ? 1 : 0;

                    System.out.print(num + " ");
                } else {
                    System.out.print(num + " ");
                    num = num == 0 ? 1 : 0;
                }
            }System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        ZeroOne(n);
    }
}
