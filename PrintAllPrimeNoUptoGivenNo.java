import java.util.Scanner;

public class PrintAllPrimeNoUptoGivenNo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int no = scanner.nextInt();
        for (int i = 2; i < no; i++) {
            if (isPrime(i)) {
                System.out.print(i+" ");
            }
        }
    }

    public static boolean isPrime(int no) {
        boolean result = false;
        int i = 2;
        if (no == 1) {
            result = false;
        } else if (i < no / 2) {
            if (no % i == 0) {
                result = false;
            } else {

                result = true;
            }
        }

        return result;
    }
}
