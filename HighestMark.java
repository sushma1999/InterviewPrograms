import java.util.Scanner;

public class HighestMark {

    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);


        int n= scanner.nextInt();
        int[] myArray = new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            myArray[i]= scanner.nextInt();
        }

        int result=FindHighest(n,myArray);
System.out.println(result);
    }

    public static int FindHighest(int n,int[] myArray)
    {

        //n=5
        // 50 36 44 11 39
        // 0  1  2  3  4
        int max =0;
        for ( int value : myArray) {

            if(value>max)
            {
                max=value;
            }

        }
        return max;


    }
}
