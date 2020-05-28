import java.util.Arrays;

public class ReverseWithoutAnotherArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3,4};
        int len = arr.length;
        int temp;
        //int[] reversed= new int[len];
        for (int i = 0; i < len/2; i++) {
            temp = arr[i];
            arr[i] = arr[len - i - 1];
            arr[len - i - 1] = temp;
            //reversed[i]=arr[len-i-1];
        }
        System.out.println(Arrays.toString(arr));

      /*  for (int i = 0; i < len; i++) {
            System.out.println(arr[i]);
        }*/

    }
}
