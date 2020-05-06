import java.util.Scanner;

public class NoOfChalk {

    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
      // double noOfDays= Math.floor(n/(1-(1/Math.sqrt(n))));
        double noOfDays = Math.round(n +  ( n*(1/Math.sqrt(n))));
        System.out.println((int)noOfDays);
    }

}
