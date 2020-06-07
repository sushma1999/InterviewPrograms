import java.util.Arrays;

public class CountingSort {
    public void sort(int[] array, int max) {
        int[] counts = new int[max + 1];
        for (var item : array)
            counts[item]++;

        var k = 0;
        for (var i = 0; i < counts.length; i++)
            for (var j = 0; j < counts[i]; j++)
                array[k++] = i;
    }
    public static void main(String[] args)
    {
        int[] numbers={1,3,4,1,3,1};
        var sorter= new CountingSort();
        sorter.sort(numbers,4);
        System.out.println(Arrays.toString(numbers));
    }
}
