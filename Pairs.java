import java.util.Scanner;

public class Pairs {
    static int countPairsWithDiffK(int arr[],
                                   int arraySize, int target) {
        int count = 0;

        for (int i = 0; i < arraySize; i++) {

            for (int j = i + 1; j < arraySize; j++)
                if (arr[i] - arr[j] == target ||
                        arr[j] - arr[i] == target)
                    count++;
        }
        return count;
    }


    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }


        System.out.println(countPairsWithDiffK(arr, n, k));
    }
}
