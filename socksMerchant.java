import java.util.*;
import java.util.Scanner;

public class socksMerchant {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c[] = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = scanner.nextInt();
        }
        Arrays.sort(c);
        int total = 0;
        for (int i = 0; i < n - 1; i++) {
            if (i < n && c[i] == c[i + 1]) {
                total++;
                i = i + 1;
            }
        }
        System.out.println(total);

    }
}