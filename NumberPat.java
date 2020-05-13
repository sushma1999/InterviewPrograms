import java.util.Scanner;

public class NumberPat {
    public static void Pattern(int n) {
        for (int i = 1; i <= n; i++) {
            int temp = i;

            for (int j = 1; j <= i; j++) {
                System.out.print(temp + " ");
                temp--;
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Pattern(n);
    }
}


