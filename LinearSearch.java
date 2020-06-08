public class LinearSearch {
    public int linearSearching(int[] array, int target) {
        for (var i = 0; i < array.length; i++)
            if (array[i] == target)
                return i;

        return -1;
    }
    public static void main(String[] args)
    {
        int[] numbers={2,4,3,5,7};
        var search= new LinearSearch();
          var result= search.linearSearching(numbers,93);
    System.out.println(result);
    }
}
