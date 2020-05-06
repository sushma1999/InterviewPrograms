import java.util.Arrays;
import java.util.Scanner;

public class ReverseAnArray {
    public static void Reverse(int[] arr, int size) {
        int[] reversed = new int[size];
        for (int i = 0; i <size; i++) {

            reversed[i] = arr[size - i - 1];

        }
      var result=  Arrays.toString(reversed);
        System.out.print(result);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        Reverse(arr,size);
    }
}
