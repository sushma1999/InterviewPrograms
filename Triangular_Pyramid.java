import java.util.Scanner;

public class Triangular_Pyramid {
    public static void pyramidPattern(int n) {
        int j, i;
        for (i = 0; i < n; i++) {
            for (j = n - i; j > 1; j--) {
                System.out.print(" ");
            }

            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        pyramidPattern(n);
    }
}
