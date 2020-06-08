public class JumpSearch {

    public int jumpSearch(int[] array, int target) {
        int blockSize = (int) Math.sqrt(array.length);
        int start = 0;
        int next = blockSize;

        while (start < array.length && array[next - 1] < target)
        {
            start = next;
            next += blockSize;
            if (next > array.length)
                next = array.length;
        }

        for (var i = start; i < next; i++)
            if (array[i] == target)
                return i;

        return -1;
    }
    public static void main(String[] args)
    {
        int[] numbers={2,3,4,5,7};
        var search= new JumpSearch();
        var index = search.jumpSearch(numbers,5);
        System.out.println(index);
    }

}
