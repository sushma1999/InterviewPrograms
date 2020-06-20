import java.util.Arrays;
import java.util.Scanner;
public class MarkAndToys {



    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int Amount = scan.nextInt();
        int sum =0;
        int item =0;
        int toyPrices[]= new int[n];

        for(int i=0;i<n;i++)
        {
            toyPrices[i]=scan.nextInt();
        }

        Arrays.sort(toyPrices);
        for(int i=0;i<n;i++)
        {
            if( sum + toyPrices[i] <=Amount){
               sum = sum+ toyPrices[i];
               item++;
            }
        }
        System.out.println(item);
    }
}
