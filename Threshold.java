import java.util.Scanner;

public class Threshold {
    public static int ThresholdFinder(int[] MyArray, int ThValue, int n) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            while (MyArray[i] > 0) {
                result++;
                MyArray[i] = MyArray[i] - ThValue;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] myArray = new int[n];
        for (int i = 0; i < n; i++) {
            myArray[i] = scan.nextInt();
        }
        int ThresholdValue = scan.nextInt();

       System.out.print(ThresholdFinder(myArray, ThresholdValue, n));
    }
}
