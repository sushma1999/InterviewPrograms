import java.util.Scanner;

public class PrimeNo {
public static void main(String[] args)
{
    Scanner scan =new Scanner(System.in);
    int n=scan.nextInt();
int divisors=0;
    for(int i=1;i<=n/2;i++){
        if(n%i==0){
            divisors++;
        }}
        if(divisors==1)
        {
            System.out.print("It is a Prime Number");
        }
        else{
            System.out.print("It is not a Prime Number");
        }



}

}
