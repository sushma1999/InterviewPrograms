import java.util.Scanner;

public class CheckIfGivenNoIsOddOrEven {

    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int no = scanner.nextInt();

        if(no%2==0)
        {
            System.out.println("Even");
        }else
        {
            System.out.println("Odd");
        }
    }
}
