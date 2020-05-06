import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class RemoveDuplicatesFromArray {

public static void RemoveDuplicates(int[] arr,int n)
{
    //arr=10,20,30,10


    HashMap<Integer,Boolean> dupli =new HashMap<>();
    for(int i=0;i<n;i++)
    {
        if(dupli.get(arr[i])==null)
        {
            System.out.print(arr[i] + " ");
            dupli.put(arr[i],true);
        }
    }

}


    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int size=scan.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=scan.nextInt();
        }
        RemoveDuplicates(arr,size);

    }




}
