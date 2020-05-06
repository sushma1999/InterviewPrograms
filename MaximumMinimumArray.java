import java.util.Arrays;
import java.util.Scanner;

public class MaximumMinimumArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] myArray = new int[size];
        for (int i = 0; i < size; i++) {
            myArray[i] = scan.nextInt();
        }
        int max = Integer.MIN_VALUE;



        int SecMax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int SecMin = Integer.MAX_VALUE;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > max) {
                SecMax = max;
                max = myArray[i];
            }
            if(myArray[i]<min){
                SecMin = min;
                min =myArray[i];
            }
        }
        System.out.print(max +" "+min+" "+SecMax+" "+SecMin);
    }
}
