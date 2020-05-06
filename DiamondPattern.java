import java.util.Scanner;

import java.util.Scanner;

public class DiamondPattern {
    public static void pyramidPattern(int n) {
        int j, i;
        int space=n-1;
        for (i = 0; i < n; i++) {
            for (j = 0; j <space; j++) {
                System.out.print(" ");
            }

            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            space--;
        }

        space=0;
        for (i = n; i > 0; i--) {
            for (j = 0; j <space; j++) {
                System.out.print(" ");
            }

            for (j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            space++;
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        pyramidPattern(n);
    }
}
