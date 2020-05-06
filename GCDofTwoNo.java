import java.util.Scanner;

public class GCDofTwoNo {

    public static int FindingGCD(int firstNo ,int secondNo)
    {
        if(secondNo==0)
        {
            return firstNo;
        }
        return FindingGCD(secondNo,firstNo%secondNo);

    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int FirstNo=scan.nextInt();
        int SecondNo=scan.nextInt();

        System.out.println(FindingGCD(FirstNo,SecondNo));
    }
}
