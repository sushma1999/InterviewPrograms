import java.util.Scanner;

public class DigitOccurance {

public static void main(String[] args)

{
    Scanner scan = new Scanner(System.in);
    int num= scan.nextInt();
    int digit=scan.nextInt();

    System.out.print(digitOcuurance(num,digit));
}
public static int digitOcuurance(int num ,int digit)
{
int temp = num;
int remainder,count=0;
while(num!=0)
{
    remainder= num%10;
    if(remainder==digit)
    {
        count++;
    }
    num=num/10;


}
return count;

}
}
