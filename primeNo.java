import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class  primeNo{

    public static boolean IsPrime(int n){
        int i=2;
        if(n==1){
            return false;
        }
        while(i<=n/2){
            if(n%i==0){
                return false;
            }
            i++;
        }
        return true;
    }

    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int number=scan.nextInt();
for (int i=0;i<number;i++)
{
    System.out.println(IsPrime(scan.nextInt())?"Prime":"Not Prime");

}
    }
}




