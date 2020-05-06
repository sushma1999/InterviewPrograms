import java.util.Scanner;

public class DigitOccurance {

    public static int CountNoOfDigit(int num, int digit) {
        int count = 0, rem, temp;
        temp = num;
        while (temp > 0) {
            rem = temp % 10;
            if (rem == digit) {
                count++;
            }
            temp = temp / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int digit = scanner.nextInt();
        System.out.print(CountNoOfDigit(num, digit));
    }
}
