public class FindDuplicatefromIntegerArray {


    public static void main(String[] args) {
        int[] MyArray = {5,6,7,7,5};

        for(int i=0;i<MyArray.length;i++)
        {
            for(int j=i+1;j<MyArray.length;j++)
            {
                if(MyArray[i]==MyArray[j]&& i!=j)
                {
                    System.out.println(MyArray[i]);
                }
            }
        }



    }}