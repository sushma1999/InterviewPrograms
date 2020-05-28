import java.util.Scanner;

public class PrimeNo {

public static void main(String[] args)
{
    Scanner scanner=new Scanner(System.in);
    int n=scanner.nextInt();

    System.out.println(IsPrimeNo(n));
}
public static boolean IsPrimeNo(int n)
{
   int i=2;
   if(n==1)
   {
       return false;
   }
   while(i<n/2){
       if(n%i==0)
       {
           return false;
       }
       i++;
   }

return true;
}

}
