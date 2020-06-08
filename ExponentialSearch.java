public class ExponentialSearch {
    public int exponentialSearch(int[] array, int target) {

        int bound = 1;
        while (bound < array.length &&array[bound] < target)
            bound *= 2;

        int left = bound / 2;
        int right = Math.min(bound, array.length - 1);
        BinarySearch search = new BinarySearch();
        return search.binarySearchRec(array, target, left, right);
    }
    public static void main(String[] args)
    {
        int[] numbers={2,3,4,5,7};
        var search= new ExponentialSearch();
       var index = search.exponentialSearch(numbers,5);
       System.out.println(index);
    }

}
