public class BinarySearch {
    public int binarySearchRec(int[] array, int target) {
        return binarySearchRec(array, target, 0, array.length - 1);
    }

    public int binarySearchRec(
            int[] array, int target, int left, int right) {

        if (right < left)
            return -1;

        int middle = (left + right) / 2;

        if (array[middle] == target)
            return middle;

        if (target < array[middle])
            return binarySearchRec(array, target, left, middle - 1);

        return binarySearchRec(array, target, middle + 1, right);
    }

    public int binarySearch(int[] array, int target) {
        var left = 0;
        var right = array.length - 1;

        while (left <= right) {
            var middle = (left + right) / 2;

            if (array[middle] == target)
                return middle;

            if (target < array[middle])
                right = middle - 1;
            else
                left = middle + 1;
        }

        return -1;
    }



    public static void main(String[] args)
    {
        int[] numbers={2,3,4,5,7,8,9,10,11};
        var search= new BinarySearch();
        var result= search.binarySearchRec(numbers,10);
      //  var result1=search.binarySearch(numbers,3);
        System.out.println(result);
     //   System.out.println(result1);
    }
}
